## Git 标签

如果项目达到一个重要的阶段，并希望永远记住那个特别的提交快照，可以使用 git tag 给它打上标签。

发布一个版本时，我们通常先在版本库中打一个标签（tag），这样就唯一确定了打标签时刻的版本。将来无论什么时候，取某个标签的版本，就是把那个打标签的时刻的历史版本取出来。

所以，标签也是版本库的一个快照。

Git 的标签虽然是版本库的快照，但其实它就是指向某个 commit 的指针（跟分支很像对不对？但是分支可以移动，标签不能移动），所以，创建和删除标签都是瞬间完成的。

> Git有commit，为什么还要引入tag？
>
> "请把上周一的那个版本打包发布，commit号是6a5819e…"
>
> "一串乱七八糟的数字不好找！"
>
> 如果换一个办法：
>
> "请把上周一的那个版本打包发布，版本号是v1.2"
>
> "好的，按照tag v1.2查找commit就行！"
>
> 所以，tag就是一个让人容易记住的有意义的名字，它跟某个commit绑在一起。

### 新建标签

Git 使用的标签有两种类型：**轻量级的（lightweight）**和**含附注的（annotated）**。

轻量级标签就像是个不会变化的分支，实际上它就是个指向特定提交对象的引用。

而含附注标签，实际上是存储在仓库中的一个独立对象，它有自身的校验和信息，包含着标签的名字，电子邮件地址和日期，以及标签说明，标签本身也允许使用 GNU Privacy Guard (GPG) 来签署或验证。

一般我们都建议使用含附注型的标签，以便保留相关信息；

当然，如果只是临时性加注标签，或者不需要旁注额外信息，用轻量级标签也没问题。

```sh
$ git tag v1.0
```

### 创建带注解的标签

```sh
$ git tag -a v1.0
```

-a 选项意为"创建一个带注解的标签"。 不用 -a 选项也可以执行的，但它不会记录这标签是啥时候打的，谁打的，也不会让你添加个标签的注解。

当执行 git tag -a 命令时，Git 会打开编辑器，让我们写一句标签注解，就像给提交写注解一样。

#### 忘记标签

如果我们忘了给某个提交打标签，又将它发布了，我们可以给它追加标签。

例如，假设我们发布了提交 85fc7e7(要追加标签的实例)，但是那时候忘了给它打标签。 我们现在也可以

```sh
$ git tag -a v0.9 85fc7e7
```

### 指定标签信息

```sh
git tag -a <tagname> -m "标签"
```

### PGP签名标签

```sh
git tag -s <tagname> -m "标签"
```

### 查看已有标签

```sh
$ git tag
v1.0
$ git tag v1.1
$ git tag
v1.1
```

### 删除标签

```sh
$ git tag -d v1.1
Deleted tag ‘v1.1’ (was 91388f0)
$ git tag
v1.0
```

### 查看此版本所修改的内容

```sh
$ git show v1.0
```

