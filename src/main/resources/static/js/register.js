let postTitle = null;
let companyName = null;
let userName = null;
let userPw = null;
let postContent = null;
let uploadFile = null; // 마지막에 체크
let postCreateDate = null;


// 등록하기 버튼 클릭
$(".resist-btn").click(function(){

    postTitle = $(".post-title").val();
    companyName = $(".company-name").val();
    userName = $(".user-name").val();
    userPw = $(".user-pw").val();
    postContent = $(".post-content").val();
    postCreateDate = $(".start-date").val().replaceAll(".","-");

    let registInfo = {
        postTitle: postTitle, 
        companyName: companyName,
        userName: userName,
        userPw: userPw,
        postContent: postContent,
        uploadFile: uploadFile,
        postCreateDate: postCreateDate
    }

    console.log(registInfo);
    
    if(postTitle == ""){
        alert("제목은 비워둘 수 없습니다.")
    }else if(userName == ""){
        alert("등록자 칸은 비워둘 수 없습니다.")
    }else if(userPw == ""){
        alert("비밀번호는 비워둘 수 없습니다.")
    }else{
        registerData(registInfo);
    }
})


// ajax로 보내야 하는 데이터
function registerData(registInfo){

    $.ajax({
        async: false,
        type: "post",
        url: "/api/register",
        contentType: "application/json",
        data: JSON.stringify(registInfo),
        dataType: "json",
        success: (response) => {
            console.log(response);
            alert("게시글 등록 완료!")
            // location.replace("/index");
        },
        error: (error) => {
            console.log(error);
            alert("게시글 등록 실패!")
        }
    })
}