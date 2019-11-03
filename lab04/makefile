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
	java $(NAME) 15 15 100 3

clean:
	rm -f *.class
