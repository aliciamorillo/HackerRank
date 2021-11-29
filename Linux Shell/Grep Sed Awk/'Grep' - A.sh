#Given a text file, which will be piped to your command through STDIN,
#use grep to display all those lines which contain any of the
#following words in them:

#the
#that
#then
#those

grep -Ewi 'the|that|then|those'