Clasa OutputWriter se ocupa de scrierea in fisierul arbore.

Folosim Clasa MyVisitor si regulile scrise in fisierul Hello.g4 pentru a citi fisierul input si a creea nodul respectiv.

De exemplu :
	Pentru Stmt putem avea un Assigment, un if, un while sau un alt Stmt.
	Pentru Assigment creem nodul AssignmentNode si vizitam cei doi copii ai sai.
	Pentru if creem IfNode, vizitam conditia si cele doua blocuri.
	Pentru while creem WhileNode, vizitam conditia si blocul acestuia.
	Pentru Stmt vom vizita fiecare Stmt(copil din Stmt) pana cand am ajuns la ultimul nod

	Pentru expresii matematice si boolene, creem nodul respectiv si vizitam copilul/copii acestuia.
	Pentru a tine cont de prioritate (prioritate('+') < prioritate('/') sau prioritate('&&') < prioritate('>') < prioritate('!')),
la reguli vom pune caracterul cu prioritatea mai mare in fata celui cu prioritatea mai mica.