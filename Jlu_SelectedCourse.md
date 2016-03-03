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
