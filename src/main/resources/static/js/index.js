
// 페이지 이동
$(".regist-btn").click(function(){
    location.href = "/register";
})


$(".replace-btn").click(function(){
    location.href = "/replace";
})

// 달력

$( function() {
    $(".start-date").datepicker(   // inputbox 의 id 가 startDate 이겠죠.
    {dateFormat:'yy.mm.dd' // 만약 2011년 4월 29일 선택하면  inputbox 에 '2011/04/29' 로표시
     , showOn: 'button' // 우측에 달력 icon 을 보인다.
     , buttonImage: '../static/images/Icon_calendar.png' // 우측 달력 icon 의 이미지 패스
     , buttonImageOnly: true //  inputbox 뒤에 달력icon만 표시한다. ('...' 표시생략)
     , changeMonth: true // 월선택 select box 표시 (기본은 false)
     ,changeYear: true  // 년선택 selectbox 표시 (기본은 false)
     ,showButtonPanel: true // 하단 today, done  버튼기능 추가 표시 (기본은 false)
   }).datepicker("setDate", new Date());

$(".end-date").datepicker({dateFormat:'yy.mm.dd',showOn: 'button'
    , buttonImage: '../static/images/Icon_calendar.png', buttonImageOnly: true
    , changeMonth: true,changeYear: true,showButtonPanel: true});
});


