<%@ page pageEncoding="UTF-8" %>
<html>
<head>
<title>Hello</title>
</head>
<script>
 $(function(){
	 $("#dd").toggle(function(){
		 this.next.show();
	 }.function(){
		 this.next.hode();
	 })
 });
 $(function(){
	$("gg").hover(function(){
		this.next.show();
	}.function(){
		this.next.hide();
	}) 
 });
 $(function(){
	 $("#checkedAll").click(fuction(){
		 $('[name=items]:checkbox').attr("checked",true);
	 });
	 $("#checkedNO").click(function(){
		 $('[name=items]:checkbox').attr("checked",false);
	 });
	 $("#checkedRev").click(function(){
		 $('[name=items]:checkbox').each(function(){
			 $(this).attr("checked",!$(this).attr("checked"));
		 })
	 });
	 $("#send").click(function(){
		 var str = "你选中的是：\r\n";
		 $('[name=items]:checkbox:checked').each(function(){
			 str += $(this).val + "\r\n";
		 });
			 
	 });
 });
</script>
<body>
<form>
      你爱好的运动是什么？<br/>
      <input type="checkbox" name="items" value="足球"/>足球
      <input type="checkbox" name="items" value="篮球"/>篮球
      <input type="checkbox" name="items" value="兵乓球"/>兵乓球
      <input type="checkbox" name="items" value="羽毛球"/>羽毛球
      <input type="checkbox" name="items" value="游泳"/>游泳
      <input type="checkbox" name="items" value="网球"/>网球
      <input type="button" id="checkedAll" value="全选">
      <input type="button" id="checkedNO" value="全不选">
      <input type="button" id="checkedRev" value="反选">
      <input type="button" id="send" value="提交">
</form>
<h1>Hello!</h1>
<h2>当前时间是：${currentTime}</h2>
</body>
</html>