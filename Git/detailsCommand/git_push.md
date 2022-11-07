## git push 命令

**git push** 命令用于从将本地的分支版本上传到远程并合并。

命令格式如下：

```sh
git push <远程主机名> <本地分支名>:<远程分支名>
```

如果本地分支名与远程分支名相同，则可以省略冒号：

```sh
git push <远程主机名> <本地分支名>
```

### 实例

以下命令将本地的 main分支推送到 origin 主机的 main 分支。

```sh
$ git push origin main
```

相等于：

```sh
$ git push origin main:main
```

如果本地版本与远程版本有差异，但又要强制推送可以使用 --force 参数：

```sh
git push --force origin main
```

删除主机的分支可以使用 --delete 参数，以下命令表示删除 origin 主机的 main分支：

```sh
git push origin --delete main
```