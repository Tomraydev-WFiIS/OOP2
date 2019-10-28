NAME = lab3

JC = javac
JFLAGS = -g
SRC = $(wildcard *.java)
OBJ = $(SRC:.java=.class)

all: program

program: $(SRC)
	$(JC) $(JFLAGS) $(SRC)

.PHONY: run clean

run:
	java $(NAME)

clean:
	rm -f *.class