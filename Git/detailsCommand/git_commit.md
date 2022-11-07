## git commit 命令

git commit 命令将暂存区内容添加到本地仓库中。

提交暂存区到本地仓库中:

```sh
git commit -m [message]
```

[message] 可以是一些备注信息。

提交暂存区的指定文件到仓库区：

```sh
$ git commit [file1] [file2] ... -m [message]
```

**-a** 参数设置修改文件后不需要执行 git add 命令，直接来提交

```sh
$ git commit -a
```

### 设置提交代码时的用户信息

开始前我们需要先设置提交的用户信息，包括用户名和邮箱：

```sh
$ git config --global user.name 'runoob'
$ git config --global user.email test@runoob.com
```

如果去掉 --global 参数只对当前仓库有效。

