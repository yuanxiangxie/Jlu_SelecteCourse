<html lang="en"><head>
    <meta charset="UTF-8">
    <title></title>
<style id="system" type="text/css">h1,h2,h3,h4,h5,h6,p,blockquote {    margin: 0;    padding: 0;}body {    font-family: "Helvetica Neue", Helvetica, "Hiragino Sans GB", Arial, sans-serif;    font-size: 13px;    line-height: 18px;    color: #737373;    margin: 10px 13px 10px 13px;}a {    color: #0069d6;}a:hover {    color: #0050a3;    text-decoration: none;}a img {    border: none;}p {    margin-bottom: 9px;}h1,h2,h3,h4,h5,h6 {    color: #404040;    line-height: 36px;}h1 {    margin-bottom: 18px;    font-size: 30px;}h2 {    font-size: 24px;}h3 {    font-size: 18px;}h4 {    font-size: 16px;}h5 {    font-size: 14px;}h6 {    font-size: 13px;}hr {    margin: 0 0 19px;    border: 0;    border-bottom: 1px solid #ccc;}blockquote {    padding: 13px 13px 21px 15px;    margin-bottom: 18px;    font-family:georgia,serif;    font-style: italic;}blockquote:before {    content:"C";    font-size:40px;    margin-left:-10px;    font-family:georgia,serif;    color:#eee;}blockquote p {    font-size: 14px;    font-weight: 300;    line-height: 18px;    margin-bottom: 0;    font-style: italic;}code, pre {    font-family: Monaco, Andale Mono, Courier New, monospace;}code {    background-color: #fee9cc;    color: rgba(0, 0, 0, 0.75);    padding: 1px 3px;    font-size: 12px;    -webkit-border-radius: 3px;    -moz-border-radius: 3px;    border-radius: 3px;}pre {    display: block;    padding: 14px;    margin: 0 0 18px;    line-height: 16px;    font-size: 11px;    border: 1px solid #d9d9d9;    white-space: pre-wrap;    word-wrap: break-word;}pre code {    background-color: #fff;    color:#737373;    font-size: 11px;    padding: 0;}@media screen and (min-width: 768px) {    body {        width: 748px;        margin:10px auto;    }}</style><style id="custom" type="text/css"></style><style type="text/css" adt="123"></style><script>if(!document.URL.match(/^http:\/\/v\.baidu\.com|http:\/\/music\.baidu\.com|http:\/\/dnf\.duowan\.com|http:\/\/bbs\.duowan\.com|http:\/\/newgame\.duowan\.com|http:\/\/my\.tv\.sohu\.com/)){
(function() {
    Function.prototype.bind = function() {
        var fn = this, args = Array.prototype.slice.call(arguments), obj = args.shift();
        return function() {
            return fn.apply(obj, args.concat(Array.prototype.slice.call(arguments)));
        };
    };
    function A() {}
    A.prototype = {
        rules: {
            /*'youku_loader': {
                'find': /^http:\/\/static\.youku\.com\/.*(loader|player_.*)(_taobao)?\.swf/,
                'replace': 'http://swf.adtchrome.com/loader.swf'
            },
            'youku_out': {
                'find': /^http:\/\/player\.youku\.com\/player\.php\/.*sid\/(.*)/,
                'replace': 'http://swf.adtchrome.com/loader.swf?VideoIDS=$1'
            },*/
            'pps_pps': {
                'find': /^http:\/\/www\.iqiyi\.com\/player\/cupid\/common\/pps_flvplay_s\.swf/,
                'replace': 'http://swf.adtchrome.com/pps_20140420.swf'
            },
            /*'iqiyi_1': {
                'find': /^http:\/\/www\.iqiyi\.com\/player\/cupid\/common\/.+\.swf$/,
                'replace': 'http://swf.adtchrome.com/iqiyi_20140624.swf'
            },
            'iqiyi_2': {
                'find': /^http:\/\/www\.iqiyi\.com\/common\/flashplayer\/\d+\/.+\.swf$/,
                'replace': 'http://swf.adtchrome.com/iqiyi_20140624.swf'
            },*/
            'ku6': {
                'find': /^http:\/\/player\.ku6cdn\.com\/default\/.*\/\d+\/(v|player|loader)\.swf/,
                'replace': 'http://swf.adtchrome.com/ku6_20140420.swf'
            },
            'ku6_topic': {
                'find': /^http:\/\/player\.ku6\.com\/inside\/(.*)\/v\.swf/,
                'replace': 'http://swf.adtchrome.com/ku6_20140420.swf?vid=$1'
            },
            'sohu': {
                'find': /^http:\/\/tv\.sohu\.com\/upload\/swf(\/p2p)?\/\d+\/Main\.swf/,
                'replace': 'http://www.adtchrome.com/sohu/sohu_20150104.swf'
            },
            'sohu2':{
                'find':/^http:\/\/[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\/testplayer\/Main0?\.swf/,
                'replace':'http://www.adtchrome.com/sohu/sohu_20150104.swf'
            },
            'sohu_share': {
                'find': /^http:\/\/share\.vrs\.sohu\.com\/my\/v\.swf&/,
                'replace': 'http://www.adtchrome.com/sohu/sohu_20150104.swf?'
            },
            'sohu_sogou' : {
                'find': /^http:\/\/share\.vrs\.sohu\.com\/(\d+)\/v\.swf/,
                'replace': 'http://www.adtchrome.com/sohu/sohu_20150104.swf?vid=$1'
            },
            /*'letv': {
                'find': /^http:\/\/player\.letvcdn\.com\/.*p\/.*\/newplayer\/LetvPlayer\.swf/,
                'replace': 'http://swf.adtchrome.com/20150110_letv.swf'
            },
            'letv_topic': {
                'find': /^http:\/\/player\.hz\.letv\.com\/hzplayer\.swf\/v_list=zhuanti/,
                'replace': 'http://swf.adtchrome.com/20150110_letv.swf'
            },
            'letv_duowan': {
                'find': /^http:\/\/assets\.dwstatic\.com\/video\/vpp\.swf/,
                'replace': 'http://yuntv.letv.com/bcloud.swf'
            },*/
            '17173_in':{
                'find':/http:\/\/f\.v\.17173cdn\.com\/(\d+\/)?flash\/PreloaderFile(Customer)?\.swf/,
                'replace':"http://swf.adtchrome.com/17173_in_20150522.swf"
            },
            '17173_out':{
                'find':/http:\/\/f\.v\.17173cdn\.com\/(\d+\/)?flash\/PreloaderFileFirstpage\.swf/,
                'replace':"http://swf.adtchrome.com/17173_out_20150522.swf"
            },
            '17173_live':{
                'find':/http:\/\/f\.v\.17173cdn\.com\/(\d+\/)?flash\/Player_stream(_firstpage)?\.swf/,
                'replace':"http://swf.adtchrome.com/17173_stream_20150522.swf"
            },
            '17173_live_out':{
                'find':/http:\/\/f\.v\.17173cdn\.com\/(\d+\/)?flash\/Player_stream_(custom)?Out\.swf/,
                'replace':"http://swf.adtchrome.com/17173.out.Live.swf"
            }
        },
        _done: null,
        get done() {
            if(!this._done) {
                this._done = new Array();
            }
            return this._done;
        },
        addAnimations: function() {
            var style = document.createElement('style');
            style.type = 'text/css';
            style.innerHTML = 'object,embed{\
                -webkit-animation-duration:.001s;-webkit-animation-name:playerInserted;\
                -ms-animation-duration:.001s;-ms-animation-name:playerInserted;\
                -o-animation-duration:.001s;-o-animation-name:playerInserted;\
                animation-duration:.001s;animation-name:playerInserted;}\
                @-webkit-keyframes playerInserted{from{opacity:0.99;}to{opacity:1;}}\
                @-ms-keyframes playerInserted{from{opacity:0.99;}to{opacity:1;}}\
                @-o-keyframes playerInserted{from{opacity:0.99;}to{opacity:1;}}\
                @keyframes playerInserted{from{opacity:0.99;}to{opacity:1;}}';
            document.getElementsByTagName('head')[0].appendChild(style);
        },
        animationsHandler: function(e) {
            if(e.animationName === 'playerInserted') {
                this.replace(e.target);
            }
        },
        replace: function(elem) {
            if(this.done.indexOf(elem) != -1) return;
            this.done.push(elem);
            var player = elem.data || elem.src;
            if(!player) return;
            var i, find, replace = false;
            for(i in this.rules) {
                find = this.rules[i]['find'];
                if(find.test(player)) {
                    replace = this.rules[i]['replace'];
                    if('function' === typeof this.rules[i]['preHandle']) {
                        this.rules[i]['preHandle'].bind(this, elem, find, replace, player)();
                    }else{
                        this.reallyReplace.bind(this, elem, find, replace)();
                    }
                    break;
                }
            }
        },
        reallyReplace: function(elem, find, replace) {
            elem.data && (elem.data = elem.data.replace(find, replace)) || elem.src && ((elem.src = elem.src.replace(find, replace)) && (elem.style.display = 'block'));
            var b = elem.querySelector("param[name='movie']");
            this.reloadPlugin(elem);
        },
        reloadPlugin: function(elem) {
            var nextSibling = elem.nextSibling;
            var parentNode = elem.parentNode;
            parentNode.removeChild(elem);
            var newElem = elem.cloneNode(true);
            this.done.push(newElem);
            if(nextSibling) {
                parentNode.insertBefore(newElem, nextSibling);
            } else {
                parentNode.appendChild(newElem);
            }
        },
        init: function() {
            var desc = navigator.mimeTypes['application/x-shockwave-flash'].description.toLowerCase();
            /*if(desc.indexOf('adobe')>-1){
                delete this.rules["iqiyi_1"];
                delete this.rules["iqiyi_2"];
            }*/
            if(document.URL.indexOf('tv.sohu.com')<=0){
                delete this.rules["sohu"];
            }
            var handler = this.animationsHandler.bind(this);
            document.body.addEventListener('webkitAnimationStart', handler, false);
            document.body.addEventListener('msAnimationStart', handler, false);
            document.body.addEventListener('oAnimationStart', handler, false);
            document.body.addEventListener('animationstart', handler, false);
            this.addAnimations();
        }
    };
    new A().init();
})();
}
// 20140730
(function cnbeta() {
    if (document.URL.indexOf('cnbeta.com') >= 0) {
        var elms = document.body.querySelectorAll("p>embed");
        Array.prototype.forEach.call(elms, function(elm) {
            elm.style.marginLeft = "0px";
        });
    }
})();
// 20150108
setTimeout(function(){
    if (document.URL.indexOf('www.baidu.com') >= 0) {
        var a = function(){
            Array.prototype.forEach.call(document.body.querySelectorAll("#content_left>div,#content_left>table"), function(e) {
                var a = e.getAttribute("style");
                if(a && /display:(table|block)\s!important/.test(a)){
                    e.removeAttribute("style")
                }
            });
        };
        a();
        document.getElementById("su").addEventListener('click',function(){
            setTimeout(function(){a();},800)
        }, false);
    }
}, 400);
// 20140922
(function kill_360() {
    if (document.URL.indexOf('so.com') >= 0) {
        document.getElementById("e_idea_pp").style.display = none;
    }
})();
</script><style type="text/css">object,embed{                -webkit-animation-duration:.001s;-webkit-animation-name:playerInserted;                -ms-animation-duration:.001s;-ms-animation-name:playerInserted;                -o-animation-duration:.001s;-o-animation-name:playerInserted;                animation-duration:.001s;animation-name:playerInserted;}                @-webkit-keyframes playerInserted{from{opacity:0.99;}to{opacity:1;}}                @-ms-keyframes playerInserted{from{opacity:0.99;}to{opacity:1;}}                @-o-keyframes playerInserted{from{opacity:0.99;}to{opacity:1;}}                @keyframes playerInserted{from{opacity:0.99;}to{opacity:1;}}</style></head>
<body marginheight="0"><h1>Jlu_SelecteCoursse(吉大选课程序)简介</h1>
<p>该程序是由纯Java语言编写的，并且没有使用任何第三方类库(今后如果增加新的模块可能会使用第三方类库)

</p>
<p>向Git上优秀的Python程序员致敬，当初第一次接触选课程序就是他们的Python程序，然后自己参考他们的代码写出了自己的Python程序，现在又将之前的Python代码用Java语言实现一遍。说实话收获还是挺大的，不过鉴于 吉大的UIMS做的实现是(此处省略若干文字)，所以收获还是很有限的。

</p>
<p>好了，废话不多说了，进入正题。


</p>
<h2>Jlu_SelecteCourse有哪些功能</h2>
<ul>
<li>方便的<code>登陆</code>功能<ul>
<li>具有<code>友好</code>的登陆界面，不再是程序员专用的黑乎乎的黑框</li>
<li><code>直接</code>输入UIMS的账号和密码即可，所有有关账号和密码的转换验证之类的操作已经由程序代替你完成</li>
</ul>
</li>
<li>登陆和选课界面操作简单，所见即所得）</li>
<li>选课(qiangke)<code>方便</code>，可以24小时在线刷</li>
<li>可以方便<code>快捷</code>的改写成暴力破解密码的程序(强烈建议：不要修改！！！不然很大概率被学校发现通报处理！！！)</li>
</ul>
<h2>Jlu_SelecteCourse的缺点</h2>
<ul>
<li>选课时需要的课程码需要登陆<a href="http://www.uims.jlu.edu.cn">uims</a>后找到选课页面中需要的课程，然后右键选择最底部的元素审查查看课程代码</li>
<li>最多只支持选择3个课程，设计中主要考虑一学期的选修课的数目差不多就是这个数，然后还需要考虑其他孩子有可能选不上好课</li>
</ul>
<h2>Jlu_SelecteCourse界面展示</h2>
<h3>Ubuntu系统</h3>
<p><img src="https://github.com/yuanxiangxie/Jlu_SelecteCourse/blob/master/MyJava/src/MyGUI/Login.png?raw=true" alt="登陆界面">

</p>
<p><img src="https://github.com/yuanxiangxie/Jlu_SelecteCourse/blob/master/MyJava/src/MyGUI/loginfailed.png?raw=true" alt="登陆失败界面">

</p>
<p><img src="https://github.com/yuanxiangxie/Jlu_SelecteCourse/blob/master/MyJava/src/MyGUI/selected.png?raw=true" alt="选课界面">

</p>
<h3>Windows系统</h3>
<p><img src="https://github.com/yuanxiangxie/Jlu_SelecteCourse/blob/master/MyJava/src/MyGUI/logins.png?raw=true" alt="登陆界面">

</p>
<p><img src="https://github.com/yuanxiangxie/Jlu_SelecteCourse/blob/master/MyJava/src/MyGUI/loginfaileds.PNG?raw=true" alt="登陆失败界面">

</p>
<p><img src="https://github.com/yuanxiangxie/Jlu_SelecteCourse/blob/master/MyJava/src/MyGUI/selecteds.PNG?raw=true" alt="选课界面">

</p>
<h2>有问题反馈</h2>
<p>在使用中有任何问题，欢迎反馈给我，可以用以下联系方式跟我交流

</p>
<ul>
<li>邮件: yuanxiangboy@163.com</li>
</ul>
<h2>捐助开发者</h2>
<p>在兴趣的驱动下,写一个<code>免费</code>的东西，有欣喜，也还有汗水，希望你喜欢我的作品，同时也能支持一下。
当然，有钱捧个钱场（右上角的爱心标志，支持支付宝和PayPal捐助），没钱捧个人场，谢谢各位。

</p>
<h2>感激</h2>
<p>感谢Git上的程序员们，同时还要感谢软件学院的刘率同学和我的室友，他们在这之中帮我解决了不少的困惑。

</p>
<h2>关于作者</h2>
<pre><code class="lang-java">public class Java
{
    private String Name;
    private int Age;
    private String Sex;

    public Java()
    {
        System.out.println("I am only a jlu student now!");
    }

    public static void main(String[] args)
    {
        Java J = new Java();
    }
}</code></pre>
<p>Edit By <a href="http://mahua.jser.me">MaHua</a></p>
</body></html>