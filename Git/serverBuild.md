## Git 服务器搭建

Github 公开的项目是免费的，2019 年开始 Github 私有存储库也可以无限制使用。这当然我们也可以自己搭建一台 Git 服务器作为私有仓库使用。

以 CentOS 为例搭建 Git 服务器。

### 1. 安装Git

```sh
$ yum install curl-devel expat-devel gettext-devel openssl-devel zlib-devel perl-devel
$ yum install git
```

 创建一个git用户组和用户，用来运行git服务：

```sh
$ groupadd git
$ useradd git -g git
```

### 2. 创建证书登录

收集所有需要登录的用户的公钥，公钥位于id_rsa.pub文件中，

把我们的公钥导入到/home/git/.ssh/authorized_keys文件里，一行一个。如果没有该文件创建它：

```sh
$ cd /home/git/
$ mkdir .ssh
$ chmod 755 .ssh
$ touch .ssh/authorized_keys
$ chmod 644 .ssh/authorized_keys
```

### 3. 初始化Git仓库

选定一个目录作为Git仓库，假定是/home/gitrepo/test.git，在/home/gitrepo目录下输入命令：

```sh
$ cd /home
$ mkdir gitrepo
$ chown git:git gitrepo/
$ cd gitrepo
$ git init --bare test.git
Initialized empty Git repository in /home/gitrepo/test.git/
```

以上命令Git创建一个空仓库，服务器上的Git仓库通常都以.git结尾。然后，把仓库所属用户改为git：

```sh
$ chown -R git:git test.git
```

### 4. 克隆仓库

```sh
$ git clone git@192.168.45.4:/home/gitrepo/test.git
Cloning into 'test'...
warning: You appear to have cloned an empty repository.
Checking connectivity... done.
```

192.168.45.4 为 Git 所在服务器 ip ，你需要将其修改为你自己的 Git 服务 ip。

这样我们的 Git 服务器安装就完成。