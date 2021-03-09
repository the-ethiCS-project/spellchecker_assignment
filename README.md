My colleague, and ethi{CS} project collaborator, Nick Zufelt and I have been redesigning our AP Computer Science-A course with the intention to have our students think more about the ethical implications of their choices as coders. Mid-year, the AP CS-A curriculum tasks students with learning about Strings and arrays, and we wondered how we could make these topics ethically interesting while still having students learn the skills they need to iterate over arrays and modify them, along with covering all of the String methods on the AP subset.

After discussing with each other (and our colleague Kiran Bhardwaj, the ethi{CS} project's lead ethicist), we came up with the thought that one way to make sure that students think about these topics with a great deal of ethical nuance is to have them think about how words (and our assumptions around what counts as 'correct' or 'normal') can be used to do harm or exclude various linguistic communities.

One way in which this is done, of course, is by spellcheckers — the wavy red underline can be used to cue our attention that something has gone wrong. However, we also know it can feel limiting or exclusive (if your name or identity or vernacular is never recognized as spelled correctly).  While Microsoft or Google's spellcheckers are far more complex than what our AP students can code at this point, we knew our students could build a version of a spellchecker that would make them ask good questions about ethical design for spellcheckers more broadly. See below for full details.

# Title: Spell Checking Project
Designed by: Stephen Russell, Phillips Academy Andover

## Short Summary
Students will write a simple spellchecker.  The spellchecker will take a misspelt word, generate a bunch of small variations of that word (e.g. by inserting a random letter, removing a letter, or swapping a letter), and then compare the variations with a list of correctly spelt words (`CorrectList`).  If there are any matches, then the spellchecker suggests one of the matches as the correctly spelt version of the original word.

## Context
This project was designed as a mid-year project for  students in the AP Computer Science A course who had been introduced to the basics for Strings and arrays. In particular, students should be familiar with all of the String methods on the AP Quick Reference Sheet.  This version of the project uses arrays and linear search. The project could easily be modified to use ArrayLists and/or sorting and binary search, if preferred.

## Learning Objectives
Students should be very comfortable with manipulating Strings, iterating through arrays and performing various operations on arrays (_e.g._ finding a min/max), and reading data from an outside file.  Students will also examine how their choice of data impacts the functioning of their program.

Students will be able to anticipate how the different factors of input data sets will impact the users of their code differently.  In addition, they should be able to discuss what different groups of people are impacted by their choice of data set and harm that might be caused by a poor choice.

## Assessment
This project had four parts: an initial brainstorming exercise, assigned in advance of the main project; writing a first draft of the code to generate many variations of a word; a first draft of code to create a database of correctly spelt words; and then revisions to their initial code plus a follow-up to their initial brainstorming exercise.

1. Students brainstormed different potential issues with the basic spellchecker design, as described in a video/powerpoint by me. (Graded complete/incomplete)
  * File: Video
  * File: Powerpoint
  * File: List of instructions + questions
2. They then submitted code for generating lots of String variations given a base word, and separate code to create and manage a database of correctly spelt words. (This was considered a rough draft and was graded complete/incomplete).
3. Next, students wrote code to create and manage a database of correctly spelt words. (This was considered a rough draft and was graded complete/incomplete).
4. After receiving feedback, students submitted their final version of the project (Assessed by both testing the spellchecker on a set of misspelt words and considering the individual components.  For example, did the student generate all words with a letter missing?). Students also submitted answers to a set of questions which followed up on what they wrote about in their initial brainstorming (graded complete/incomplete)

## Plan
### Spellchecker Design
The first part of the project involves students taking a word (which will eventually be the incorrectly spelt word), and making many small variations to it.  I had students do the following: add every letter to every possible spot (`hello` -> `ahello`, `bhello`, ..., `haello`, ..., `helloz`), remove a letter from each spot (`hello` -> `ello`, `hllo`, ...), change a letter to a different letter (`hello` -> `aello`, `bello`, ...) and swap adjacent letters (`hello` -> `ehllo`, `hlelo`, ...).  They can take all of the words they generate and put them onto an array (or an `ArrayList`).  If they are using an array, they will have to consider how to find the correct size of the array to hold all of the modifications they are doing.

The second part of the project is for students to take a large text file (_e.g._ a book sourced from Project Gutenberg) and put all of the words on the file into an array.  Ideally they would keep track of how many times each word has occurred, so that they can measure how common various words are.

The final part is for students to find all words that appear on both the array of variations and the array of correctly spelt words.  They can then suggest those words as correct versions of the misspelt word.  If there are multiple words that appear on both arrays, students can use the most common word as their suggestion.

There are many technical considerations for students to think through in designing a spellchecker. In particular, we hoped students would notice:

* Where a given set of choices might introduce false positives or false negatives.
* That it might be reasonable for the spellchecker to suggest higher-frequency words over lower-frequency words, and suggestions might prioritize how close errant letters are on the keyboard (e.g., "qpple" is a more likely misspelling of "apple" than "bpple").

### Teaching Notes
I structured the assignment using the `StringPermuter` class to handle generating all the variations of a word (part I) and the `Spellchecker` class to deal with the creation of all the list of correctly spelt words (part II).  I supplied the code which students used to read words in from a text file (the `FileReader` class), as there are some complicated things that occur with punctuation.

### CS Modifications
One possible expansion of the project would be to have students keep track of which variations of a word are more likely (_e.g._ spelling `pun` as `qun` isn't likely).  Another would be to look at doing more complex variations (_e.g._ adding/removing two letters).

### Ethics Pedagogy
One good way to have students think about the ethics of a new-to-them coding project is to give students a chance to have a 'first draft' answer where they can start to think about the ethical implications of a spellchecker design or execution, and then (after further consideration) a chance to revisit their initial answers and improve upon them. For this reason, we bookended this project by an initial brainstorming exercise [FILES: ppt, list of questions] and a follow-up after having completed their code [FILE: list of questions].

Yet in particular, we hoped students would recognize the following ethical considerations by the end of the project:
* An assumption that a spellchecker is designed to correct for "proper English words" may be in error. After all, linguistic communities use different words, and we might want to design a spellchecker that can do well by that broad set of linguistic communities.
* We also wouldn't want to focus unduly on an English-language bias (or US-oriented conventions). For example, different countries use a different keyboard layout; our spellchecker might correct away from correctly-spelled words with accented letters.
The CorrectList (the list of correctly-spelled words') is sourced from materials that themselves might introduce a bias.

In total, we hoped students would be able to ask themselves, the following ethical questions:
Who might be harmed based upon the choice of 'correctly-spelled words' or permutations considered in the spell-checking design?
Whose responsibility is it to determine the set of base texts? (The programmer's? Someone else's? If so, who?)

Midway, we gave students time for [class discussion] (link to Kiran's Argument Repair explanation).

## Results
During our initial discussion, when asked what words would need to be included to make the spellchecker work well for many groups of people, students said the following:

* "[Make sure] it includes proper nouns, slang, and other words not necessarily included in a dictionary. That it includes words from different languages and alphabets, not just English."
* "It is important to think about different world languages throughout a variety of populations, as well as different dialects within the same language (and even a single population). Different regions use different words to say the same thing (_e.g._ using `finna` instead of `gonna`)."
* "One would need to consider creating a large bank of Proper Nouns and slang from a variety of popular sources such as Wikipedia and other databases."

After completing the project, students answered a similar question about who might be harmed by a poor choice of correct words:

* "Names of Native American objects and traditions and African American English would likely get excluded. Scientists and historians would not get accurate suggestions. People who use languages other than English (or Standard English for that matter, which was decided by historically privileged groups like aristocrats and white people)."
* "Therefore, a base text can be used – inadvertently or on purpose – to undermine other groups of people and their culture. By claiming one specific way of speaking is 'correct' and labeling all other words as "incorrect", a spellchecker can separate people into 'correct' and 'incorrect' as well"
* "People whose ideas aren't usually covered in the media"
