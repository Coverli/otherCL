## git mv 命令

git mv 命令用于移动或重命名一个文件、目录或软连接。

```sh
git mv [file] [newfile]
```

如果新文件名已经存在，但还是要重命名它，可以使用 **-f** 参数

```sh
git mv -f [file] [newfile]
```

### 实例

我们可以添加一个 README 文件（如果没有的话）：

```sh
$ git add README 
```

然后对其重命名:

```sh
$ git mv README  README.md
$ ls
README.md
```