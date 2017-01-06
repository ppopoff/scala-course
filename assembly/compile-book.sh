#!/bin/bash


# todo: create help command
# todo: select between ru and eng versions

# the whole file
all_chapters=""

for chapter in ../textbook/ru/*/ ; do
  chapter_text=`eval cat $chapter*`
  all_chapters="$all_chapters\n\n$chapter_text"
done

#echo "$all_chapters"

pandoc --latex-engine=xelatex -s -o "book.html" <<< "$all_chapters"

