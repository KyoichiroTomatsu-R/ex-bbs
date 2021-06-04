/**
 * 
 */
 console.log('第1問');
 console.log('戸松恭一朗');
 
  console.log('第2問');
 let firstName = 'kyoichiro';
 let lastName = 'tomatsu';
 
 console.log(firstName + ' ' + lastName);
 
  console.log('第3問');
 console.log('小計');
 console.log(200*3+250*4);
 console.log('消費税');
 console.log((200*3+250*4)/10);
 console.log('合計金額');
 console.log((200*3+250*4)+(200*3+250*4)/10);
 
  console.log('第4問');
 let testScore = 80;
 if(0 <= testScore && testScore <=79){
	console.log('追試です');
 } else if (80 <= testScore && testScore <=120){
	console.log('合格です');
}else{
	console.log('存在しない点数です');
}

 console.log('第5問');
let sum = 0;
for(let i = 1;i <= 100;i++){
	sum += i;	
}

console.log(sum);

 console.log('第ボ問');

function add(a,b){
	return a+b;
}
function sub(a,b){
	return a-b;
}
function multi(a,b){
	return a*b;
}
function div(a,b){
	return a/b;
}



let num1 = 5;
let num2 = 3;

console.log('5+3='+ add(num1,num2));
console.log('5-3='+ sub(num1,num2));
console.log('5*3='+ multi(num1,num2));
console.log('5/3='+ div(num1,num2));



