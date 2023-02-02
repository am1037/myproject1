function letsCount(k) {
    for (i = 0; i < k; i++) {
        for (j = 0; j < i; j++) {
            document.write(i);
        }
        document.write('<br>');
    }
}

function squareGol() {
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            document.write('@');
        }
        document.write('<br>');
    }
}

function siteSelect(siteName) {
    if (siteName == 'naver') {
        location.href = "http://www.naver.com/"
    } else if (siteName == 'daum') {
        location.href = "http://www.daum.net/"
    } else {
        location.href = "http://www.google.com/"
    }
}

function 여행하다() {
    console.log('여행을 해요');
}

function letsRest() {
    console.log('쉬어요');
}

function areYou() {
    let aaa = confirm('당신은 자바 프로그래머인가요');
    if (aaa == 1) { console.log('훌륭한 프로그래머시군요'); }
    else { console.log('다른 언어를 사용하시는군요'); }
}

function coffeeCalc(cost, num, overcost) {
    if (cost * num > overcost) {
        console.log('할인해드릴게요');
    }
    else {
        console.log('정가로 내셔야합니다');

    }
}

function coffeeWho(str, cost) {
    if (str == 커피 && cost < 5000) {
        console.log('내가 살게요.');
    }
    else {
        console.log('네가 사세요.');
    }
}

function ampm() {
    let aaa = prompt('오전인가요 오후인가요');
    if(aaa=='오전'){
        for(i=0;i<3;i++){
            document.write('굿모닝<br>');
        }
    }
    else if(aaa=='오후'){
        for(i=0;i<5;i++){
            document.write('굿애프터눈<br>');
        }
    }
    else{
        for(i=0;i<10;i++){
            document.write('굿나잇<br>');
        }
    }
}