/**
 * 
 */
$(function()
		{
	$(".btn-gnavi").on("click", function()//設置漢堡菜單位置的變量
			{
				var rightVal = 0;//為沒有「open」類的元素設置菜單關閉狀態（rightVal為0狀態）
				if($(this).hasClass("open"))//使用「open」類設置元素以打開菜單 
					{
						rightVal = -300;
						$(this).removeClass("open");//將菜單設置為在打開菜單後下次單擊時關閉
					} else {
						$(this).addClass("open");   //將菜單設置為再關閉菜單後下次單擊時打開
					}
				$("#global-navi").stop().animate(
					{
						right: rightVal
					}, 200);//顯示位置與移動速度
			});
		});

