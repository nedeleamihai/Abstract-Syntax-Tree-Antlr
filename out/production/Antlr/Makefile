build:
	java -jar antlr-4.7.1-complete.jar Hello.g4 -visitor
	javac -cp ./antlr-4.7.1-complete.jar *.java

run:
	java -cp .:antlr-4.7.1-complete.jar Main input

clean:
	rm *.class *.interp *.tokens Hello*.java
	rm arbore