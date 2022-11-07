## Git 分支管理

几乎每一种版本控制系统都以某种形式支持分支，一个分支代表一条独立的开发线。

使用分支意味着你可以从开发主线上分离开来，然后在不影响主线的同时继续工作。

![](./img/branchManagement_1.svg)

Git 分支实际上是指向更改快照的指针。

有人把 Git 的分支模型称为**必杀技特性**，而正是因为它，将 **Git** 从版本控制系统家族里区分出来。

创建分支命令：

```sh
git branch (branchname)
```

切换分支命令:

```sh
git checkout (branchname)
```

当你切换分支的时候，Git 会用该分支的最后提交的快照替换你的工作目录的内容， 所以多个分支不需要多个目录。

合并分支命令:

```sh
git merge
```

可以多次合并到统一分支， 也可以选择在合并之后直接删除被并入的分支。

### 列出分支

列出分支基本命令：

```sh
git branch
```

没有参数时，**git branch** 会列出你在本地的分支。

```sh
$ git branch
* main
```

当执行 **git init** 的时候，默认情况下 Git 就会创建 **main** 分支。

* 如果要手动创建一个分支。执行 **git branch (branchname)** 即可。当以此方式在上次提交更新之后创建了新分支，如果后来又有更新提交， 然后又切换到了新分支，Git 将还原工作目录到创建分支时候的样子

#### 实例1

```sh
$ ls
README
$ echo 'test' > test.txt
$ git add .
$ git commit -m 'add test.txt'
[master 3e92c19] add test.txt
 1 file changed, 1 insertion(+)
 create mode 100644 test.txt
$ ls
README        test.txt
$ git checkout testing
Switched to branch 'testing'
$ ls
README
```

* 也可以使用 **git checkout -b (branchname)** 命令来创建新分支并立即切换到该分支下，从而在该分支中操作。

#### 实例2

```sh
$ git checkout -b newtest
Switched to a new branch 'newtest'
$ git rm test.txt 
rm 'test.txt'
$ ls
README
$ touch test.php
$ git add .
$ git commit -am 'removed test.txt、add test.php'
[newtest c1501a2] removed test.txt、add test.php
 2 files changed, 1 deletion(-)
 create mode 100644 test.php
 delete mode 100644 test.txt
$ ls
README        test.php
$ git checkout master
Switched to branch 'main'
$ ls
README        test.txt
```

### 删除分支

删除分支命令：

```sh
git branch -d (branchname)
```

### 分支合并

一旦某分支有了独立内容，你终究会希望将它合并回到你的主分支。 你可以使用以下命令将任何分支合并到当前分支中去：

```sh
git merge (branchname)
```

