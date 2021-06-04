/**
 * 
 */

'use strict';
$(function(){


    //問1
    console.log('戸松恭一朗');
    //問2
    $(document).on( 'click','#name_btn',function () { 
        $('#name').css('color','red');
        
    });
    //問3
    $(document).on( 'click','#age_btn',function () { 
        
        let age = $('#age').val();

        alert(age);
        
    });
    //問4
    $(document).on( 'click','#btn',function () { 
        
        $('#btn').prop('disabled',true);
        
    });
    //問5
    $('#java').hide();
    $('#javascript').hide();

    $(document).on('change','#lang',function () { 
        if($('#lang').val()==1){
            $('#java').show();
            $('#javascript').hide();
        } else if($('#lang').val()==2){
            $('#javascript').show();
            $('#java').hide();
        }else{
            $('#javascript').hide();
            $('#java').hide();
        }

    });


})