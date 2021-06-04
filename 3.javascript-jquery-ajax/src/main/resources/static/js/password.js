/**
 * 
 */
 'use strict';
$(function(){
	$(document).on('keyup','.pass', function () {
		let hostUrl = 'http://localhost:8080/password/check';
		let inputPass = $('#password').val();
		let inputPassConfirm = $('#passwordConfirm').val();
		$.ajax({
			url:hostUrl,
			type:'post',
			dataType:'json',
			data:{
				password:inputPass,
				passwordConfirm:inputPassConfirm
			},
			async:true,
		}).done(function(data){
			console.log(data);
			console.dir(JSON.stringify(data));
			$('#passwordMessage').text(data.passwordMessage);
			$('#passwordConfirmMessage').text(data.passwordConfirmMessage);
		}).fail(function(XMLHttpRequest,textStatus,errorThrown){
			alert('エラー発生');
			console.log('XMLHttpRequest:' + XMLHttpRequest.status);
			console.log('textStatus:' + textStatus);
			console.log('errorThrown:' + errorThrown.message);
		})
	});
})