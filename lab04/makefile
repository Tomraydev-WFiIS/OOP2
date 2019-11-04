NAME = lab04

JC = javac
JFLAGS = -g
SRC = $(wildcard *.java)
OBJ = $(SRC:.java=.class)

all: program

program: $(SRC)
	$(JC) $(JFLAGS) $(SRC)

.PHONY: run clean

run:
	java $(NAME) 10 10 50 1 

clean:
	rm -f *.class
	rm -rf docs

docs:
	javadoc -d docs Board.java
