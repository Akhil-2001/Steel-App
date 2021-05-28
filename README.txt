*Adding files or updating a repo in github: 

git init
git add .
git commit -m "Commit message"
git remote add origin https://github.com/yourusername/your-repo-name.git
git push -u origin [branch _name]  
git config --global user.name "John Doe"
git config --global user.email johndoe@example.com
Note:select login using browser


*Cloning a repo :
git clone https://github.com/yourusername/your-repo-name.git
Perform any changes......
git commit -m "Commit message"
git push -u origin [Branch_Name] 


*Create,  move to and push the new branch to the hub :

git checkout -b [name_of_your_new_branch]
git push origin [name_of_your_new_branch]
git fetch = update local branches from the hub
git checkout [name_of_your_branch]  = change branches

*List branches of the repository:

git branch -a
git  branch --list
git branch


*unable to checkout a branch :

git fetch
git checkout origin/<BRANCH-NAME>
git remote update
git fetch 
git checkout --track origin/<BRANCH-NAME>


*Deleting a branch:

git push origin :[name_of_your_new_branch] = delete from the hub
git branch -D [name_of_your_new_branch]  = delete branch locally