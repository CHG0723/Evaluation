layui.define(['element', 'layer', 'util', 'form'], function (exports) {
    var $ = layui.jquery;
    var element = layui.element;
    var layer = layui.layer;
    var util = layui.util;
    var form = layui.form;
    //form.render();
    //快捷菜单开关
    $('span.sys-title').click(function (e) {
        e.stopPropagation();    //阻止事件冒泡
        $('div.short-menu').slideToggle('fast');
    });
    $('div.short-menu').click(function (e) {
        e.stopPropagation();    //阻止事件冒泡
    });
    $(document).click(function () {
        $('div.short-menu').slideUp('fast');
        $('.individuation').removeClass('bounceInRight').addClass('flipOutY');
    });
    //个性化设置开关
    $('#individuation').click(function (e) {
        e.stopPropagation();    //阻止事件冒泡
        $('.individuation').removeClass('layui-hide').toggleClass('bounceInRight').toggleClass('flipOutY');
    });
    $('.individuation').click(function (e) {
        e.stopPropagation();    //阻止事件冒泡
    })
    $('.layui-body').click(function () {
        $('.individuation').removeClass('bounceInRight').addClass('flipOutY');
    });

    //监听顶部导航点击
    $('.href-url').on('click', function () {
        var url = $(this).attr('data-url');   //页面url
        var title = $(this).text();           //菜单名称
        $('#title-id').text(title);
        $('#content-id').attr('src', url);
    });



    //皮肤切换
    $('.skin').click(function () {
        var skin = $(this).attr("data-skin");
        $('body').removeClass();
        $('body').addClass(skin);
    });

    $("#logout").click(function () {
        $.post("login/logout",function (msg) {
            if (msg===true){
                layer.msg('退出成功，正在跳转......', {icon: 6});
                setTimeout(function () {
                    location.href = "index";
                }, 2000);
            }else {
                layer.msg('退出失败，请联系管理员', {icon: 5});
            }
        })
    });

    exports('main', {});
});
