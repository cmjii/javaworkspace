//컨트롤러에서 리스트 달라고 요청
async function getCommentListFromserver(bno){
    try {
        const resp = await fetch("/cmt/list/"+bno);
        const result = await resp.json();
        console.log(result);
        return result;
    } catch (error) {
        console.log(error);
    }
}
function spreadCommentList(result){ //result -> 댓글 리스트
    console.log("comment List -> "+result);
    let div = document.getElementById("commentLine");
    let writer = document.getElementById("cmtWriter").value;
    div.innerHTML=""; //원래 만들어뒀던 구조 지우기
    for(let i=0; i<result.length; i++){
        let html = '<div>';
        html+= `<div>${result[i].cno}, ${result[i].bno}, ${result[i].writer}, ${result[i].regdate}</div>`;
        html+=`<div>`;
        html+=`<input type="text" class="cmtText" value="${result[i].content}" <br>`; 
        if(result[i].writer==id){
            html+=`<br><button type="button" data-cno="${result[i].cno}" class="cmtModBtn">수정</button>`;
            html+=`<button type="button" data-cno="${result[i].cno}" class="cmtDelBtn">삭제</button><br><hr>`;
        }
        html+=`</div></div>`;
        div.innerHTML += html; //각 댓글 객체를 누적해서 담기

    }
}

function printCommentList(bno){
    getCommentListFromserver(bno).then(result => {
        if(result.length>0){
            spreadCommentList(result);
        }else{
            let div = document.getElementById("commentLine");
            div.innerHTML = `<div>댓글이 없습니다.`;
        }
    })
}


document.getElementById('cmtAddBtn').addEventListener('click',()=>{
    const cmtText = document.getElementById('cmtText').value;
    if(cmtText==null || cmtText ==''){
        alert('댓글을 입력해주세요.');
        return false;
    }else{
        //댓글등록
        let cmtData = {
            bno: bnoVal,
            writer : document.getElementById('cmtWriter').value,
            content: cmtText
        };
        // 댓글 등록 비동기 통신 호출
        postCommentToserver(cmtData).then(result=>{
            console.log(result);
            if(result > 0){
                alert('댓글 등록 성공');
                document.getElementById('cmtText').value='';
            
            }
            //댓글 출력
            printCommentList(bnoVal);
        })
    }
})

async function postCommentToserver(cmtData){
    try {
        const url = "/cmt/post";
        const config={
            //method, headers, body
            method:'post',
            Headers:{
                'Content-Type':'application/json; charset=utf-8'
            },
            body: JSON.stringify(cmtData)
        };

        const resp = await fetch (url, config);
        const result = await resp.text(); //isok 값을 리턴
        return result;

    } catch (error) {
        console.log(error);
    }
}

//수정 : cno,content => result isok
async function updateCommentFromserver(cnoVal,cmtText){
    try {
        const url = "/cmt/modify";
        const config ={
            method:'post',
            headers:{
                'Content-Type':'application/json; charset=utf-8'
            },
            body: JSON.stringify({cno:cnoVal, content:cmtText})
        }

        const resp = await fetch(url, config);
        const result = await resp.text();
        return result;
    } catch (error) {
        console.log(error);
    }
}

//삭제 : cno => result isok 
async function deleteCommentFromserver(cnoVal){

try {
    const url = "/cmt/remove?cnoVal="+cnoVal;
        const resp = await fetch(url);
        const result = resp.text();
        return result;
} catch (error) {
    console.log(error);
}
}

document.addEventListener('click',(e)=>{
    console.log(e.target);
//삭제 버튼이 클릭 되면,, 수정버튼이 클릭 되면,,
if(e.target.classList.contains('cmtDelBtn')){
    let cnoVal = e.target.dataset.cno; //data-cno의 value값을 추출
    console.log(cnoVal);
    deleteCommentFromserver(cnoVal).then(result=>{
        if(result>0){
            alert("댓글삭제 성공");
            printCommentList(bnoVal);
        }
    })
}


//수정 버튼이 클릭되면
if(e.target.classList.contains('cmtModBtn')){
    let cnoVal = e.target.dataset.cno;
    console.log(cnoVal);
    let div = e.target.closest('div'); //타켓을 기준으로 가장 가까운 div를 찾기
    let cmtText = div.querySelector('.cmtText').value;
    console.log(cmtText);

    updateCommentFromserver(cnoVal,cmtText).then(result=>{
        if(result>0){
            alert("댓글 수정 성공");
            printCommentList(bnoVal);
        }
    })
}
})