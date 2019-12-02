NAME = lab7

JC = javac
JFLAGS = -g
SRC = $(wildcard *.java)
OBJ = $(SRC:.java=.class)

all: program

program: $(SRC)
	$(JC) $(JFLAGS) $(SRC)

.PHONY: run clean

test:
	java $(NAME) < input1.txt
	java $(NAME) < input2.txt

clean:
	rm -f *.class
	rm -rf docs
	rm output

docs:
	javadoc -d docs *.java
