## git rm 命令

git rm 命令用于删除文件。

如果只是简单地从工作目录中手工删除文件，运行 **git status** 时就会在 **Changes not staged for commit** 的提示。

git rm 删除文件有以下几种形式：

### 普通删除

将文件从暂存区和工作区中删除

```sh
git rm <file>
```

以下实例从暂存区和工作区中删除 runoob.txt 文件：

```sh
git rm runoob.txt 
```

### 强制删除

如果删除之前修改过并且已经放到暂存区域的话，则必须要用强制删除选项 **-f**

强行从暂存区和工作区中删除修改后的 hello.txt 文件：

```sh
git rm -f hello.txt 
```

### 从暂存区域移除

如果想把文件从暂存区域移除，但仍然希望保留在当前工作目录中，换句话说，仅是从跟踪清单中删除，使用 **--cached** 选项即可：

```sh
git rm --cached <file>
```

以下实例从暂存区中删除 hello.txt 文件：

```sh
git rm --cached hello.txt
```