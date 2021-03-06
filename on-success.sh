#!/bin/sh
# Automatically cherrypick the last commit through the following branches:
# 2.1 -} 2.2 -} 2.3 -} master

CURRENT_BRANCH=$TRAVIS_BRANCH
LAST_COMMIT=$(git rev-list -1 HEAD)

echo last commit $LAST_COMMIT
echo current branch $CURRENT_BRANCH

echo ------------------------

echo Automatic cherrypick last commit $LAST_COMMIT changes into 2.2,master

git fetch --all

git checkout 2.2 && git cherry-pick $LAST_COMMIT && git push origin 2.2

git checkout master && git cherry-pick $LAST_COMMIT && git push origin master
