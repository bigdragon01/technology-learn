ssh-keygen -t dsa
将id_dsa.pub文件内容复制到项目-> Settings -> Deploy Keys
若无法提交代码，在项目.git/config文件中将username和password添加到url中
例子：密码中最好不要包含@
[remote "origin"]
	url = https://username:password@github.com/bigdragon01/technology-learn.git
	fetch = +refs/heads/*:refs/remotes/origin/*