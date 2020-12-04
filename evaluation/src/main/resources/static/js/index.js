layui.define(['element', 'layer', 'form'], function (exports) {
    var form = layui.form;
    var $ = layui.jquery;
    //监听登陆提交
    form.on('submit(login)', function (data) {
        var userType = $('#userType option:selected').val();

        $.ajax({
            type: 'POST',
            url: "login/login",
            data: {"username": $("#username").val(), "password": $("#password").val(), "userType": userType},
            success: function (msg) { // 返回的RequestResult的json对象
                var url = "";
                if (msg > 0) {
                    if (msg === 1) {
                        url = "main";
                    } else if (msg === 2) {
                        url = "mainTea"
                    } else {
                        url = "mainStudent";
                    }
                    layer.msg('登陆成功，正在跳转......', {icon: 6});
                    setTimeout(function () {
                        window.location.href = url;
                    }, 2000);
                } else {
                    layer.msg('账号或者密码错误', {icon: 5});
                }
            },
        });

        return false;
    });
    //检测键盘按下
    $('body').keydown(function (e) {
        if (e.keyCode == 13) {  //Enter键
            if ($('#layer-login').length <= 0) {
                login();
            } else {
                $('button[lay-filter=login]').click();
            }
        }
    });

    $('.enter').on('click', login);

    function login() {
        var loginHtml = ''; //静态页面只能拼接，这里可以用iFrame或者Ajax请求分部视图。html文件夹下有login.html

        loginHtml += '<form class="layui-form" action="">';
        loginHtml += '<div class="layui-form-item">';
        loginHtml += '<label class="layui-form-label">账号</label>';
        loginHtml += '<div class="layui-input-inline pm-login-input">';
        loginHtml += '<input type="text" name="account" id="username" lay-verify="account" placeholder="请输入账号" value="admin" autocomplete="off" class="layui-input">';
        loginHtml += '</div>';
        loginHtml += '</div>';
        loginHtml += '<div class="layui-form-item">';
        loginHtml += '<label class="layui-form-label">密码</label>';
        loginHtml += '<div class="layui-input-inline pm-login-input">';
        loginHtml += '<input type="password" name="password" id="password" lay-verify="passWord" placeholder="请输入密码" value="123" autocomplete="off" class="layui-input">';
        loginHtml += '</div>';
        loginHtml += '</div>';
        loginHtml += '<div class="layui-form-item">';
        loginHtml += '<label class="layui-form-label">用户身份</label>';
        loginHtml += '<div class="layui-input-inline"><select name="quiz1" class="userType" id="userType">';
        loginHtml += '<option value="1" selected="" >管理员</option><option value="2">教师</option><option value="3">学生</option></select>';

        loginHtml += '</div>';
        loginHtml += '</div>';
        loginHtml += '<div class="layui-form-item" style="margin-top:25px;margin-bottom:0;">';
        loginHtml += '<div class="layui-input-block">';
        loginHtml += ' <button class="layui-btn" style="width:230px;" lay-submit="" lay-filter="login">立即登录</button>';
        loginHtml += ' </div>';
        loginHtml += ' </div>';
        loginHtml += '</form>';

        layer.open({
            id: 'layer-login',
            type: 1,
            title: false,
            shade: 0.4,
            shadeClose: true,
            area: ['480px', '294px'],
            closeBtn: 0,
            anim: 1,
            skin: 'pm-layer-login',
            content: loginHtml
        });
        layui.form.render();
    }

    exports('index', {});
});

