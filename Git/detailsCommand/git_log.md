## git log

在使用 Git 提交了若干更新之后，又或者克隆了某个项目，想回顾下提交历史，我们可以使用 **git log** 命令查看。

使用 git log 命令列出历史提交记录：

```sh
$ git log
```

### --oneline

可以用 --oneline 选项来查看历史记录的简洁的版本

```sh
$ git log --oneline
```

### --reverse

可以用 --reverse 参数来逆向显示所有日志

```sh
$ git log --reverse --oneline
```

### --author

如果只想查找指定用户的提交日志可以使用命令：git log --author ,

 例如，要找 Git 源码中 Linus 提交的部分：

```sh
$ git log --author=Linus --oneline -5
```

### 指定日期

如果你要指定日期，可以执行几个选项：--since 和 --before，但是你也可以用 --until 和 --after。

例如，如果要看 Git 项目中三周前且在四月十八日之后的所有提交，可以执行这个（还用了 --no-merges 选项以隐藏合并提交）：

```sh
$ git log --oneline --before={3.weeks.ago} --after={2010-04-18} --no-merges
```
