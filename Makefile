all: build

build:
	javac src/*.java
	cd src; jar cfe EVP.jar Main *.class; mv EVP.jar ..
	@echo 'Fertig!'
	@echo 'Zum Ausführen: java -jar EVP.jar [<args>]'

help:
	@echo "Usage: make <commands>\n"
	@echo "The commands are:"
	@echo "	all         Default target, runs build"
	@echo "	build       Compiles and packs the .jar."
	@echo "	help        Prints this help."
	@echo "	list        Lists all source files."
	@echo "	install     Installs the .jar on the system. (Only Mac OS)"
	@echo "	run         Runs the .jar."
	@echo "	clean       Deletes the .jar and the binaries.\n"
list:
	@cd src; \
	ls *.java

install:
	mv EVP.jar /Applications

run:
	java -jar EVP.jar

clean:
	rm -f src/*.class
	rm -f EVP.jar
