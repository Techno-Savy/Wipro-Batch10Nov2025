console.log("Welcome to jQuery");

//$("p.second").hide();
//$("#first").hide();

// $("#btn_hide").click(function(){

//     $(".second").hide()
// })

$("#btn_hide").click(function(){

    //  $(".second").text("Done by jQuery ")
    //  document.write($(".second").text());

    // with this you will get only text 
     console.log($(".second").text());
     // with this you will html elements and text both
     console.log($(".second").html());
 })

// The best practice is when you write you JS or jQuery code then 
// use document ready function which will ensure that our full content is loaded

// $(document).ready(function(){
// $("#btn_hide").click(function(){
//     // for hide and show all together you can use toggle
//     $(".second").toggle(2000, function()
// {
//  console.log("Toggle done");   
// });
// });
// });

$(document).ready(function(){
$("#fading_effect").click(function(){
    $(".third").fadeOut();
   // $(".third").fadeTo("slow", 0.5);
});
});

// for slide toggle
// $(document).ready(function(){
// $("#btn_hide").click(function(){
//     // for hide and show all together you can use toggle
//     $(".second").slideDown();
// });
// });


//Box effects
// for slide toggle
$(document).ready(function(){
$("#Box").click(function(){
    // for hide and show all together you can use toggle
    $(".box").animate({
        width: "+=200px",
        height: "200px",
        fontSize:"20px"
    },"slow");
});
});
// in fadeTo we may pass the speed as slow with opacity in between 0 and 1
$("body").keydown(function(event){
    if(event.which === 65)
    {
        $(".second").hide(2000 ,function(){
            console.log("task completed");
        });
    }

     if(event.which === 68)
    {
        $(".second").show(2000 ,function(){
            console.log("task completed");
    });
    console.log(event.which);
}
});