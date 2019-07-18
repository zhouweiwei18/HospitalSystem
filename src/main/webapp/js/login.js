$("#btn_login").click(function(){
    var loginObj = new Object();
    loginObj.accountNo= $("#inputAccount").val();
    loginObj.pwd= $("#inputPassword").val();
    var loginJson = JSON.stringify(loginObj); //将JSON对象转化为JSON字符    
    $.post('main/validateLogin.do',
            {"loginObj":loginJson},
            function(e){
                e=JSON.parse(e); //由JSON字符串转换为JSON对象
                if(e.accountMsg){
                    $("#accountDiv").addClass("has-error");
                    $("#accountMsg").removeClass("hidden");

                    $("#pwdDiv").removeClass("has-error");
                    $("#pwdMsg").addClass("hidden");
                }else if (e.pwdMsg){
                    $("#accountDiv").removeClass("has-error");
                    $("#accountMsg").addClass("hidden");

                    $("#pwdDiv").addClass("has-error");
                    $("#pwdMsg").removeClass("hidden");
                }else if (e.user){
                    //location.href="main/successLogin.do";
                    $("#loginForm").submit();
                }
    });
});