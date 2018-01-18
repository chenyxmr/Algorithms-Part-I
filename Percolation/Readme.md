Got full mark after 7 submissions.

```
See the Assessment Guide for information on how to interpret this report.

ASSESSMENT SUMMARY

Compilation:  PASSED
API:          PASSED

Findbugs:     PASSED
PMD:          PASSED
Checkstyle:   FAILED (0 errors, 35 warnings)

Correctness:  30/30 tests passed
Memory:       9/8 tests passed
Timing:       20/20 tests passed

Aggregate score: 101.25%
[Compilation: 5%, API: 5%, Findbugs: 0%, PMD: 0%, Checkstyle: 0%, Correctness: 60%, Memory: 10%, Timing: 20%]

ASSESSMENT DETAILS

The following files were submitted:
----------------------------------
3.4K Jan 18 01:42 Percolation.java
2.1K Jan 18 01:42 PercolationStats.java


********************************************************************************
*  COMPILING                                                                    
********************************************************************************


% javac Percolation.java
*-----------------------------------------------------------

% javac PercolationStats.java
*-----------------------------------------------------------


================================================================


Checking the APIs of your programs.
*-----------------------------------------------------------
Percolation:

PercolationStats:

================================================================


********************************************************************************
*  CHECKING STYLE AND COMMON BUG PATTERNS                                       
********************************************************************************


% findbugs *.class
*-----------------------------------------------------------


================================================================


% pmd .
*-----------------------------------------------------------
Percolation.java:5: The private instance (or static) variable 'unionFind' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
Percolation.java:6: The private instance (or static) variable 'size' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
Percolation.java:8: Can you replace the instance (or static) variable 'hi' with a local variable? [SingularField]
Percolation.java:8: The private instance (or static) variable 'hi' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
PercolationStats.java:5: Can you replace the instance (or static) variable 'percolateNum' with a local variable? [SingularField]
PercolationStats.java:5: The private instance (or static) variable 'percolateNum' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
PercolationStats.java:6: The private instance (or static) variable 'confidenceHiValue' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
PercolationStats.java:6: The private instance (or static) variable 'confidenceLoValue' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
PercolationStats.java:6: The private instance (or static) variable 'meanValue' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
PercolationStats.java:6: The private instance (or static) variable 'stddevValue' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
PMD ends with 10 warnings.


================================================================


% checkstyle *.java
*-----------------------------------------------------------
[WARN] Percolation.java:13:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:19:12: 'for' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:22:12: 'for' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:27:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:29:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:32:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:34:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:36:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:40:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:44:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:48:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:55:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:60:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:66:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:68:11: '//' or '/*' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:69:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:80:11: '//' or '/*' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:85:14: 'while' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:87:15: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] PercolationStats.java:9:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] PercolationStats.java:12:12: 'for' is not followed by whitespace. [WhitespaceAfter]
[WARN] PercolationStats.java:14:18: 'while' is not followed by whitespace. [WhitespaceAfter]
[WARN] PercolationStats.java:17:19: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] PercolationStats.java:20:19: 'if' is not followed by whitespace. [WhitespaceAfter]
Checkstyle ends with 0 errors and 24 warnings.

% custom checkstyle checks for Percolation.java
*-----------------------------------------------------------
[WARN] Percolation.java:1: We recommend defining at least one private helper method, e.g., to validate the row and column indices or to map from 2D to 1D indices. [Design]
[WARN] Percolation.java:33:29: The numeric literal '0x06' appears to be unnecessary. [NumericLiteral]
[WARN] Percolation.java:37:68: The numeric literal '0x07' appears to be unnecessary. [NumericLiteral]
[WARN] Percolation.java:41:68: The numeric literal '0x07' appears to be unnecessary. [NumericLiteral]
[WARN] Percolation.java:45:65: The numeric literal '0x07' appears to be unnecessary. [NumericLiteral]
[WARN] Percolation.java:49:65: The numeric literal '0x07' appears to be unnecessary. [NumericLiteral]
[WARN] Percolation.java:52:57: The numeric literal '0x07' appears to be unnecessary. [NumericLiteral]
[WARN] Percolation.java:54:25: The numeric literal '0x08' appears to be unnecessary. [NumericLiteral]
[WARN] Percolation.java:62:48: The numeric literal '0x08' appears to be unnecessary. [NumericLiteral]
Checkstyle ends with 0 errors and 9 warnings.

% custom checkstyle checks for PercolationStats.java
*-----------------------------------------------------------
[WARN] PercolationStats.java:1: The number (0) of calls to 'Integer.parseInt()' must equal the number (2) of integer command-line arguments. [CommandLineArgument]
[WARN] PercolationStats.java:1:1: The constant '1.96' appears more than once. Define a constant variable (such as 'CONFIDENCE_95') to hold the constant '1.96'. [NumericLiteralCount]
Checkstyle ends with 0 errors and 2 warnings.


================================================================


********************************************************************************
*  TESTING CORRECTNESS
********************************************************************************

Testing correctness of Percolation
*-----------------------------------------------------------
Running 15 total tests.

Tests 1 through 8 create a Percolation object using your code, then repeatedly
open sites by calling open(). After each call to open(), it checks the return
values of isOpen(), percolates(), numberOfOpenSites(), and isFull() in that order.
Except as noted, a site is opened at most once.

Tests 13 through 15 test backwash.

Test 1: open predetermined list of sites using file inputs
  * filename = input6.txt
  * filename = input8.txt
  * filename = input8-no.txt
  * filename = input10-no.txt
  * filename = greeting57.txt
  * filename = heart25.txt
==> passed

Test 2: open random sites until just before system percolates
  * n = 3
  * n = 5
  * n = 10
  * n = 10
  * n = 20
  * n = 20
  * n = 50
  * n = 50
==> passed

Test 3: open predetermined sites for n = 1 and n = 2 (corner case test)
  * filename = input1.txt
  * filename = input1-no.txt
  * filename = input2.txt
  * filename = input2-no.txt
==> passed

Test 4: check predetermined sites with long percolating path
  * filename = snake13.txt
  * filename = snake101.txt
==> passed

Test 5: open every site
  * filename = input5.txt
==> passed

Test 6: open random sites until just before system percolates,
        allowing open() to be called on a site more than once
  * n = 3
  * n = 5
  * n = 10
  * n = 10
  * n = 20
  * n = 20
  * n = 50
  * n = 50
==> passed

Test 7: call methods with invalid arguments
  * n = 10, (row, col) = (-1, 5)
  * n = 10, (row, col) = (11, 5)
  * n = 10, (row, col) = (0, 5)
  * n = 10, (row, col) = (5, -1)
  * n = 10, (row, col) = (5, 11)
  * n = 10, (row, col) = (5, 0)
  * n = 10, (row, col) = (-2147483648, -2147483648)
  * n = 10, (row, col) = (2147483647, 2147483647)
==> passed

Test 8: call constructor with invalid argument
  * n = -10
  * n = -1
  * n = 0
==> passed

Test 9: create multiple Percolation objects at the same time
        (to make sure you didn't store data in static variables)
==> passed

Test 10: open predetermined list of sites using file inputs,
         but permute the order in which methods are called
  * filename = input8.txt;  order =     isFull(),     isOpen(), percolates()
  * filename = input8.txt;  order =     isFull(), percolates(),     isOpen()
  * filename = input8.txt;  order =     isOpen(),     isFull(), percolates()
  * filename = input8.txt;  order =     isOpen(), percolates(),     isFull()
  * filename = input8.txt;  order = percolates(),     isOpen(),     isFull()
  * filename = input8.txt;  order = percolates(),     isFull(),     isOpen()
==> passed

Test 11: call all methods in random order until just before system percolates
  * n = 3
  * n = 5
  * n = 7
  * n = 10
  * n = 20
  * n = 50
==> passed

Test 12: call all methods in random order until almost all sites are open,
         but with inputs not prone to backwash
  * n = 3
  * n = 5
  * n = 7
  * n = 10
  * n = 20
  * n = 50
==> passed

Test 13: check for backwash with predetermined sites
  * filename = input20.txt
  * filename = input10.txt
  * filename = input50.txt
  * filename = jerry47.txt
  * filename = sedgewick60.txt
  * filename = wayne98.txt
==> passed

Test 14: check for backwash with predetermined sites that have
         multiple percolating paths
  * filename = input3.txt
  * filename = input4.txt
  * filename = input7.txt
==> passed

Test 15: call all methods in random order until all sites are open,
         allowing isOpen() to be called on a site more than once
         (these inputs are prone to backwash)
  * n = 3
  * n = 5
  * n = 7
  * n = 10
  * n = 20
  * n = 50
==> passed


Total: 15/15 tests passed!


================================================================
********************************************************************************
*  TESTING CORRECTNESS (substituting reference Percolation)
********************************************************************************

Testing correctness of PercolationStats
*-----------------------------------------------------------
Running 15 total tests.

Test 1: check that methods in PercolationStats do not print to standard output
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 2: check that mean() returns value in expected range
  * n =   2, trials = 10000
  * n =   5, trials = 10000
  * n =  10, trials = 10000
  * n =  25, trials = 10000
==> passed

Test 3: check that stddev() returns value in expected range
  * n =   2, trials = 10000
  * n =   5, trials = 10000
  * n =  10, trials = 10000
  * n =  25, trials = 10000
==> passed

Test 4: check that PercolationStats creates trials Percolation objects, each of size n-by-n
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 5: check that PercolationStats calls open() until system percolates
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 6: check that PercolationStats does not call open() after system percolates
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 7: check that mean() is consistent with the number of intercepted calls to open()
        on blocked sites
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 8: check that stddev() is consistent with the number of intercepted calls to open()
        on blocked sites
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 9: check that confidenceLo() and confidenceHigh() are consistent with mean() and stddev()
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 10: check that exception is thrown if either n or trials is out of bounds
  * n = -23, trials =  42
  * n =  23, trials =   0
  * n = -42, trials =   0
  * n =  42, trials =  -1
  * n = -2147483648, trials = -2147483648
==> passed

Test 11: create two PercolationStats objects at the same time and check mean()
         (to make sure you didn't store data in static variables)
  * n1 =  50, trials1 =  10, n2 =  50, trials2 =   5
  * n1 =  50, trials1 =   5, n2 =  50, trials2 =  10
  * n1 =  50, trials1 =  10, n2 =  25, trials2 =  10
  * n1 =  25, trials1 =  10, n2 =  50, trials2 =  10
  * n1 =  50, trials1 =  10, n2 =  15, trials2 = 100
  * n1 =  15, trials1 = 100, n2 =  50, trials2 =  10
==> passed

Test 12: check that the methods return the same value, regardless of
         the order in which they are called
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 13: check that no calls to StdRandom.setSeed()
  * n = 20, trials = 10
  * n = 20, trials = 10
  * n = 40, trials = 10
  * n = 80, trials = 10
==> passed

Test 14: check distribution of number of sites opened until percolation
  * n = 2, trials = 100000
  * n = 3, trials = 100000
  * n = 4, trials = 100000
==> passed

Test 15: check that each site is opened the expected number of times
  * n = 2, trials = 100000
  * n = 3, trials = 100000
  * n = 4, trials = 100000
==> passed


Total: 15/15 tests passed!


================================================================
********************************************************************************
*  MEMORY (substituting reference Percolation)
********************************************************************************

Analyzing memory of PercolationStats
*-----------------------------------------------------------
Running 4 total tests.

Test 1a-1d: check memory usage as a function of T trials for n = 100
            (max allowed: 8*T + 128 bytes)

                 T        bytes
--------------------------------------------
=> passed       16          144         
=> passed       32          208         
=> passed       64          336         
=> passed      128          592         
==> 4/4 tests passed


Estimated student memory = 4.00 T + 80.00   (R^2 = 1.000)

Total: 4/4 tests passed!

================================================================



********************************************************************************
*  TIMING (substituting reference Percolation)
********************************************************************************

Timing PercolationStats
*-----------------------------------------------------------
Running 4 total tests.

Test 1: count calls to StdStats.mean() and StdStats.stddev()
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 2: count calls to methods in StdRandom
  * n = 20, trials = 10
  * n = 20, trials = 10
  * n = 40, trials = 10
  * n = 80, trials = 10
==> passed

Test 3: count calls to methods in Percolation
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 4: Call PercolationStats methods with trials = 3 and values of n that go up
        by a factor of sqrt(2). The test passes when n reaches 2,896.

     The approximate order-of-growth is n ^ (log ratio)

         n  seconds log ratio
     ------------------------
       724     0.22       2.5
      1024     0.51       2.4
      1448     1.51       3.1
      2048     4.01       2.8
      2896     8.60       2.2
==> passed


Total: 4/4 tests passed!


================================================================



********************************************************************************
*  MEMORY
********************************************************************************

Analyzing memory of Percolation
*-----------------------------------------------------------
Running 4 total tests.

Test 1a-1d: check that total memory <= 17 n^2 + 128 n + 1024 bytes

                 n        bytes
--------------------------------------------
=> passed       64        41160         
=> passed      256       655560         
=> passed      512      2621640         
=> passed     1024     10485960         
==> 4/4 tests passed


Estimated student memory = 10.00 n^2 + 0.00 n + 200.00   (R^2 = 1.000)


Test 2 (bonus): check that total memory <= 11 n^2 + 128 n + 1024 bytes
==> passed


Total: 5/4 tests passed!

================================================================



********************************************************************************
*  TIMING
********************************************************************************

Timing Percolation
*-----------------------------------------------------------
Running 16 total tests.

Test 1a-1e: Creates an n-by-n percolation system; open sites at random until
            the system percolates, interleaving calls to percolates() and open().
            Count calls to connected(), union() and find().

                                       2 * connected()
                 n       union()              + find()        constructor
-----------------------------------------------------------------------------------
=> passed       16          199                   342                   1         
=> passed       32          899                  1543                   1         
=> passed       64         3238                  5746                   1         
=> passed      128        12632                 22644                   1         
=> passed      256        44125                 81820                   1         
=> passed      512       185794                341307                   1         
=> passed     1024       748568               1373741                   1         
==> 7/7 tests passed


If one of the values in the table violates the performance limits
the factor by which you failed the test appears in parentheses.
For example, (9.6x) in the union() column indicates that it uses
9.6x too many calls.


Tests 2a-2f: Check whether the number of calls to union(), connected(), and find()
             is a constant per call to open(), isOpen(), isFull(), and percolates().
             The table shows the maximum number of union(), connected(), and
             find() calls made during a single call to open(), isOpen(), isFull(),
             and percolates().

                 n     per open()      per isOpen()    per isFull()    per percolates() 
---------------------------------------------------------------------------------------------
=> passed       16        5               0               1               0         
=> passed       32        5               0               1               0         
=> passed       64        5               0               1               0         
=> passed      128        5               0               1               0         
=> passed      256        5               0               1               0         
=> passed      512        5               0               1               0         
=> passed     1024        5               0               1               0         
==> 7/7 tests passed



Running time (in seconds) depends on the machine on which the script runs.


Test 3: Create an n-by-n percolation system; interleave calls to percolates()
        and open() until the system percolates. The values of n go up by a
        factor of sqrt(2). The test is passed if n >= 4096 in under 10 seconds.

     The approximate order-of-growth is n ^ (log ratio)

                        log   union-find     log
         n  seconds   ratio   operations   ratio
     -------------------------------------------
      1024     0.17     2.7      2862674     2.0
      1448     0.45     2.9      5647398     2.0
      2048     1.08     2.5     11298864     2.0
      2896     2.74     2.7     22615887     2.0
      4096     5.58     2.1     45355340     2.0
==> passed



Test 4: Create an n-by-n percolation system; interleave calls to open(),
        percolates(), isOpen(), isFull(), and numberOfOpenSites() until.
        the system percolates. The values of n go up by a factor of sqrt(2).
        The test is passed if n >= 4096 in under 10 seconds.

                        log   union-find     log
         n  seconds   ratio   operations   ratio
     -------------------------------------------
      1024     0.11     1.9      2817785     2.0
      1448     0.40     3.7      5676036     2.0
      2048     1.16     3.0     11293809     2.0
      2896     2.57     2.3     22567087     2.0
      4096     4.97     1.9     45395780     2.0
==> passed


Total: 16/16 tests passed!


================================================================




```

