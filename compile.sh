javac -d bin -cp bin src/binarysearch/FileToStringArray.java
javac -d bin -cp bin src/binarysearch/BinarySearch.java

javac -d bin -cp bin src/AutoFill.java
javac -d bin -cp bin tests/test1.java

java -cp bin test1 $1
