function getQueryString(name) {
    var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)', 'i');
    var r = window.location.search.substr(1).match(reg);
    if (r != null) {
        return unescape(r[2]);
    }
    return null;
}

/**
 * 获取url参数值
 * @param name
 * @returns
 */
function getParam(name) {
    var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)', 'i');
    var r = window.location.search.substr(1).match(reg);
    if (r != null) {
        return unescape(r[2]);
    }
    return null;
}

/**
 * 判断非空
 * @param obj
 * @returns
 */
function isEmpty(obj) {
    if (typeof obj == "undefined" || obj == null || obj == "") {
        return true;
    } else {
        return false;
    }
}

//控i输出制
function log(obj) {
    console.log(obj);
}

/**
 * layer弹窗
 * @param url
 * @param t
 * @param w
 * @param h
 * @returns
 */
function layerOpen(url, t, w, h) {
    parent.layer.open({
        type: 2,
        title: t,
        shade: [0.8, '#393D49'],  //阴影度
        fix: false,
        skin: 'demo-class',
        offset: '100px',
        shadeClose: false,
        anim: 4,
        maxmin: false,
        area: [w, h],   //窗体大小（宽,高）
        content: url,

    });
}

/**
 * 弹框
 * @param obj
 * @returns
 */
function aler(obj) {
    layer.msg(obj, {
        time: 2000
    });
}