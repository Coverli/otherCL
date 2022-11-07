## git remote 命令

**git remote** 命令用于在远程仓库的操作

### 显示所有远程仓库

```sh
git remote -v
```

实例

```sh
$ git remote -v
origin  https://github.com/Coverli/CLtools.git (fetch)
origin  https://github.com/Coverli/CLtools.git (push)
```

origin 为远程地址的别名

### 显示某个远程仓库的信息

```sh
git remote show [remote]
```

实例

```sh
$ git remote show https://github.com/Coverli/CLtools.git
* remote https://github.com/Coverli/CLtools.git
  Fetch URL: https://github.com/Coverli/CLtools.git
  Push  URL: https://github.com/Coverli/CLtools.git
  HEAD branch: main
  Local ref configured for 'git push':
    main pushes to main (up to date)
```

### 添加远程版本库

```sh
git remote add [shortname] [url]
```

shortname 为本地的版本库

实例

```sh
git remote add origin https://github.com/Coverli/CLtools.git
```

### 其他相关命令

```sh
git remote rm name  # 删除远程仓库
git remote rename old_name new_name  # 修改仓库名
```