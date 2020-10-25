grammar Hello;          // defines a grammar called 'Hello' (must equal the filename)
r: 'hello' ID;          // match the keyword 'hello' followed by an identifier
ID: [a-z]+;             // match lower-case identifiers
WS: [\t\r\n]+ -> skip;  // skip spaces, tabs, newlines, \r (windows)