## 发布Feed

### 具体的步骤

1. 为 RSS 命名。请注意文件必须有 .xml 的后缀

2. 验证 RSS 文件（可以在 [http://www.feedvalidator.org](http://www.feedvalidator.org/) 找到很好的验证器）

3. 把 RSS 文件上传到 web 服务器上的 web 目录

4. 把这个小的橙色按钮 ![RSS Logo](https://www.runoob.com/images/rss.gif) 或 ![XML Logo](https://www.runoob.com/images/xml.gif) 拷贝到 web 目录。

5. 在希望向外界提供 RSS 的页面上放置这个小按钮。然后向这个按钮添加一个指向 RSS 文件的链接。代码应该类似这样：

   ```xml
   <a href="http://www.runoob.com/feed">
   	<img loading="lazy" src="http://www.runoob.com/images/rss.gif" width="36" height="14">
   </a>
   ```

6. 把 RSS feed 提交到 RSS Feed 目录。要注意 feed 的 URL 不是你的页面，而是指向你的 feed 的 URL，比如 "http://www.runoob.com/feed"。 此处提供一些免费的 RSS 聚合服务：[http://www.newsisfree.com/user/new](http://www.newsisfree.com/user/new/)
7. 在重要的搜索引擎注册您的 feed
   * [WordPress](http://wordpress.org/)
   * [Blogger](http://www.blogger.com/)
   * [Radio](http://radio.userland.com/)
8. 更新 feed 。现在已获得了来自 Google、Yahoo、以及 MSN 的 RSS feed 按钮。但需要经常更新内容，并保持 RSS feed 的长期可用

## 维护 RSS feed

* 确保 RSS feed 按照期望的方式工作的最好的办法，就是自己来维护它

* 不过，这么做很费时，特别是对于大量的更新工作来讲

* 替代方案是使用一个第三方的自动 RSS

## 自动的 RSS

* 对于那些仅需要一个用于个人网站的 RSS feed 的用户来说，一些流行的 blog (Web Log) 管理器可提供内建的 RSS 服务

1. [WordPress](http://wordpress.org/)
2. [Blogger](http://www.blogger.com/)
3. [Radio](http://radio.userland.com/)