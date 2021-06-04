/**
 * 
 */
 'use strict';
 $(function(){
    $('#status').text('入金前').val();
    $('#next').text('入金済へ変更').val();

    $(document).on('click','#next',function(){
        

        let hostUrl = 'http://localhost:8080/post/post';
        let status = $('#status').val();
        let button = $('#next').val();
        $.ajax({
            type: "post",
            url: "hostUrl",
            data: {
                status:status,
                next:button
            },
            dataType: "json",
            async:true,
        }).done(function(data){
            console.log(data);
			console.dir(JSON.stringify(data));
            $('#status').text(data.statusMessage);
            $('#next').text(data.messageMessage);

        }).fail(function(XMLHttpRequest,textStatus,errorThrown){
            alert('エラー発生');
			console.log('XMLHttpRequest:' + XMLHttpRequest.status);
			console.log('textStatus:' + textStatus);
			console.log('errorThrown:' + errorThrown.message);
        });

    })
 })
 