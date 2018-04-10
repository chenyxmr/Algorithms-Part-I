

See the Assessment Guide for information on how to interpret this report.

ASSESSMENT SUMMARY

Compilation:  PASSED
API:          PASSED

Findbugs:     PASSED
PMD:          PASSED
Checkstyle:   FAILED (0 errors, 49 warnings)

Correctness:  36/36 tests passed
Memory:       16/16 tests passed
Timing:       42/42 tests passed

Aggregate score: 100.00%
[Compilation: 5%, API: 5%, Findbugs: 0%, PMD: 0%, Checkstyle: 0%, Correctness: 60%, Memory: 10%, Timing: 20%]

ASSESSMENT DETAILS

The following files were submitted:
----------------------------------
6.3K Apr 10 10:42 KdTree.java
1.7K Apr 10 10:42 PointSET.java

********************************************************************************
*  COMPILING                                                                    
********************************************************************************


% javac PointSET.java
*-----------------------------------------------------------

% javac KdTree.java
*-----------------------------------------------------------


================================================================


Checking the APIs of your programs.
*-----------------------------------------------------------
PointSET:

KdTree:

================================================================

********************************************************************************
*  CHECKING STYLE AND COMMON BUG PATTERNS                                       
********************************************************************************


% findbugs *.class
*-----------------------------------------------------------


================================================================


% pmd .
*-----------------------------------------------------------
KdTree.java:10: The private instance (or static) variable 'p' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
KdTree.java:179: The 'if' or 'else' clause appears to serve no purpose because its body is empty. [EmptyIfStmt]
KdTree.java:179: There appears to be a spurious semicolon. [EmptyStatementNotInLoop]
KdTree.java:183: The method body is empty. If this is your intent, document it with a comment. [UncommentedEmptyMethodBody]
PointSET.java:7: The private instance (or static) variable 'set' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
PointSET.java:58: The method body is empty. If this is your intent, document it with a comment. [UncommentedEmptyMethodBody]
PMD ends with 6 warnings.


================================================================


% checkstyle *.java
*-----------------------------------------------------------
[WARN] KdTree.java:16:15: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:32:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:34:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:40:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:44:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:47:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:48:16: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:55:16: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:64:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:68:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:71:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:72:16: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:79:16: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:88:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:93:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:95:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:98:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:102:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:111:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:118:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:124:44: ',' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:124:73: ',' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:128:49: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] KdTree.java:129:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:136:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:138:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:140:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:142:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:147:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:149:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:154:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:157:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:159:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:161:12: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:162:33: '?' is not preceded with whitespace. [WhitespaceAround]
[WARN] KdTree.java:162:50: ':' is not preceded with whitespace. [WhitespaceAround]
[WARN] KdTree.java:163:16: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:165:20: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] KdTree.java:170:20: 'if' is not followed by whitespace. [WhitespaceAfter]
...
Checkstyle ends with 0 errors and 49 warnings.

% custom checkstyle checks for PointSET.java
*-----------------------------------------------------------

% custom checkstyle checks for KdTree.java
*-----------------------------------------------------------


================================================================

********************************************************************************
*  TESTING CORRECTNESS
********************************************************************************

Testing correctness of PointSET
*-----------------------------------------------------------
Running 8 total tests.

A point in an m-by-m grid means that it is of the form (i/m, j/m),
where i and j are integers between 0 and m

Test 1: inserting n random points and check size() after each insertion
        (size may be less than n because of duplicates)
  * 100000 random points in a 65536-by-65536 grid
  * 100000 random points in a 8192-by-8192 grid
  * 100000 random points in a 1024-by-1024 grid
  * 100000 random points in a 128-by-128 grid
  * 100000 random points in a 16-by-16 grid
  ==> passed

Test 2: check isEmpty() for n = 0, 1, and 2 points
  * 0 points
  * 1 point
  * 2 points
  ==> passed

Test 3: insert n random points and check contains() for n random query points
  * 100000 random points in a 65536-by-65536 grid
  * 100000 random points in a 8192-by-8192 grid
  * 100000 random points in a 1024-by-1024 grid
  * 100000 random points in a 128-by-128 grid
  * 100000 random points in a 16-by-16 grid
  ==> passed

Test 4: insert n random points and check nearest() for n random query points
  * 1000 random points in a 65536-by-65536 grid
  * 1000 random points in a 8192-by-8192 grid
  * 1000 random points in a 1024-by-1024 grid
  * 1000 random points in a 128-by-128 grid
  * 1000 random points in a 16-by-16 grid
  ==> passed

Test 5: insert n random points and check range() for n random query rectangles
  * 1000 random rectangles and points in a 65536-by-65536 grid
  * 1000 random rectangles and points in a 8192-by-8192 grid
  * 1000 random rectangles and points in a 1024-by-1024 grid
  * 1000 random rectangles and points in a 128-by-128 grid
  * 1000 random rectangles and points in a 16-by-16 grid
  ==> passed

Test 6: check intermixed sequence of calls to isEmpty(), size(),
        insert(), contains(), range(), and nearest() with probabilities
        p1, p2, p3, p4, p5, and p6, respectively
  * 10000 calls with random points in a 8192-by-8192 grid
    and probabilities 0.05, 0.05, 0.3, 0.2, 0.2, 0.2
  * 10000 calls with random points in a 1024-by-1024 grid
    and probabilities 0.05, 0.05, 0.3, 0.2, 0.2, 0.2
  * 10000 calls with random points in a 128-by-128 grid
    and probabilities 0.05, 0.05, 0.3, 0.2, 0.2, 0.2
  * 10000 calls with random points in a 16-by-16 grid
    and probabilities 0.05, 0.05, 0.3, 0.2, 0.2, 0.2
  * 10000 calls with random points in a 1-by-1 grid
    and probabilities 0.05, 0.05, 0.3, 0.2, 0.2, 0.2
    ==> passed

Test 7: check intermixed sequence of calls to isEmpty(), size(),
        insert(), contains(), range(), and nearest() with probabilities
        p1, p2, p3=0, p4, p5, and p6, respectively
        (data structure with 0 points)
  * 1000 calls with random points in a 1024-by-1024 grid
    and probabilities 0.5, 0.5, 0.0, 0.0, 0.0, 0.0
  * 1000 calls with random points in a 1024-by-1024 grid
    and probabilities 0.2, 0.2, 0.0, 0.6, 0.0, 0.0
  * 1000 calls with random points in a 1024-by-1024 grid
    and probabilities 0.2, 0.2, 0.0, 0.0, 0.6, 0.0
  * 1000 calls with random points in a 1024-by-1024 grid
    and probabilities 0.2, 0.2, 0.0, 0.0, 0.0, 0.6
  * 1000 calls with random points in a 1024-by-1024 grid
    and probabilities 0.2, 0.2, 0.0, 0.2, 0.2, 0.2
    ==> passed

Test 8: check whether two PointSET objects can be created at the same time
==> passed


Total: 8/8 tests passed!


================================================================
Testing correctness of KdTree
*-----------------------------------------------------------
Running 28 total tests.

In the tests below, we consider three classes of points and rectangles.

  * Non-degenerate points: no two points (or rectangles) share either an
         x-coordinate or a y-coordinate

  * Distinct points:       no two points (or rectangles) share both an
         x-coordinate and a y-coordinate

  * General points:        no restrictions on the x-coordinates or y-coordinates
         of the points (or rectangles)

A point in an m-by-m grid means that it is of the form (i/m, j/m),
where i and j are integers between 0 and m (inclusive).

Test 1a: insert points from file; check size() and isEmpty() after each insertion
  * input0.txt
  * input1.txt
  * input5.txt
  * input10.txt
  ==> passed

Test 1b: insert non-degenerate points; check size() and isEmpty() after each insertion
  * 1 random non-degenerate points in a 1-by-1 grid
  * 5 random non-degenerate points in a 8-by-8 grid
  * 10 random non-degenerate points in a 16-by-16 grid
  * 50 random non-degenerate points in a 128-by-128 grid
  * 500 random non-degenerate points in a 1024-by-1024 grid
  * 50000 random non-degenerate points in a 65536-by-65536 grid
  ==> passed

Test 1c: insert distinct points; check size() and isEmpty() after each insertion
  * 1 random distinct points in a 1-by-1 grid
  * 10 random distinct points in a 8-by-8 grid
  * 20 random distinct points in a 16-by-16 grid
  * 10000 random distinct points in a 128-by-128 grid
  * 100000 random distinct points in a 1024-by-1024 grid
  * 100000 random distinct points in a 65536-by-65536 grid
  ==> passed

Test 1d: insert general points; check size() and isEmpty() after each insertion
  * 5 random general points in a 1-by-1 grid
  * 10 random general points in a 4-by-4 grid
  * 50 random general points in a 8-by-8 grid
  * 100000 random general points in a 16-by-16 grid
  * 100000 random general points in a 128-by-128 grid
  * 100000 random general points in a 1024-by-1024 grid
  ==> passed

Test 2a: insert points from file; check contains() with random query points
  * input0.txt
  * input1.txt
  * input5.txt
  * input10.txt
  ==> passed

Test 2b: insert non-degenerate points; check contains() with random query points
  * 1 random non-degenerate points in a 1-by-1 grid
  * 5 random non-degenerate points in a 8-by-8 grid
  * 10 random non-degenerate points in a 16-by-16 grid
  * 20 random non-degenerate points in a 32-by-32 grid
  * 500 random non-degenerate points in a 1024-by-1024 grid
  * 10000 random non-degenerate points in a 65536-by-65536 grid
  ==> passed

Test 2c: insert distinct points; check contains() with random query points
  * 1 random distinct points in a 1-by-1 grid
  * 10 random distinct points in a 4-by-4 grid
  * 20 random distinct points in a 8-by-8 grid
  * 10000 random distinct points in a 128-by-128 grid
  * 100000 random distinct points in a 1024-by-1024 grid
  * 100000 random distinct points in a 65536-by-65536 grid
  ==> passed

Test 2d: insert general points; check contains() with random query points
  * 10000 random general points in a 1-by-1 grid
  * 10000 random general points in a 16-by-16 grid
  * 10000 random general points in a 128-by-128 grid
  * 10000 random general points in a 1024-by-1024 grid
  ==> passed

Test 3a: insert points from file; check range() with random query rectangles
  * input0.txt
  * input1.txt
  * input5.txt
  * input10.txt
  ==> passed

Test 3b: insert non-degenerate points; check range() with random query rectangles
  * 1 random non-degenerate points and random rectangles in a 2-by-2 grid
  * 5 random non-degenerate points and random rectangles in a 8-by-8 grid
  * 10 random non-degenerate points and random rectangles in a 16-by-16 grid
  * 20 random non-degenerate points and random rectangles in a 32-by-32 grid
  * 500 random non-degenerate points and random rectangles in a 1024-by-1024 grid
  * 10000 random non-degenerate points and random rectangles in a 65536-by-65536 grid
  ==> passed

Test 3c: insert distinct points; check range() with random query rectangles
  * 2 random distinct points and random rectangles in a 2-by-2 grid
  * 10 random distinct points and random rectangles in a 4-by-4 grid
  * 20 random distinct points and random rectangles in a 8-by-8 grid
  * 100 random distinct points and random rectangles in a 16-by-16 grid
  * 1000 random distinct points and random rectangles in a 64-by-64 grid
  * 10000 random distinct points and random rectangles in a 128-by-128 grid
  ==> passed

Test 3d: insert general points; check range() with random query rectangles
  * 5000 random general points and random rectangles in a 2-by-2 grid
  * 5000 random general points and random rectangles in a 16-by-16 grid
  * 5000 random general points and random rectangles in a 128-by-128 grid
  * 5000 random general points and random rectangles in a 1024-by-1024 grid
  ==> passed

Test 3e: insert random points; check range() with tiny rectangles
         enclosing each point
  * 5 tiny rectangles and 5 general points in a 2-by-2 grid
  * 10 tiny rectangles and 10 general points in a 4-by-4 grid
  * 20 tiny rectangles and 20 general points in a 8-by-8 grid
  * 5000 tiny rectangles and 5000 general points in a 128-by-128 grid
  * 5000 tiny rectangles and 5000 general points in a 1024-by-1024 grid
  * 5000 tiny rectangles and 5000 general points in a 65536-by-65536 grid
  ==> passed

Test 4a: insert points from file; check range() with random query rectangles
         and check traversal of kd-tree
  * input5.txt
  * input10.txt
  ==> passed

Test 4b: insert non-degenerate points; check range() with random query rectangles
         and check traversal of kd-tree
  * 3 random non-degenerate points and 1000 random rectangles in a 4-by-4 grid
  * 6 random non-degenerate points and 1000 random rectangles in a 8-by-8 grid
  * 10 random non-degenerate points and 1000 random rectangles in a 16-by-16 grid
  * 20 random non-degenerate points and 1000 random rectangles in a 32-by-32 grid
  * 30 random non-degenerate points and 1000 random rectangles in a 64-by-64 grid
  ==> passed

Test 5a: insert points from file; check nearest() with random query points
  * input0.txt
  * input1.txt
  * input5.txt
  * input10.txt
  ==> passed

Test 5b: insert non-degenerate points; check nearest() with random query points
  * 5 random non-degenerate points in a 8-by-8 grid
  * 10 random non-degenerate points in a 16-by-16 grid
  * 20 random non-degenerate points in a 32-by-32 grid
  * 30 random non-degenerate points in a 64-by-64 grid
  * 10000 random non-degenerate points in a 65536-by-65536 grid
  ==> passed

Test 5c: insert distinct points; check nearest() with random query points
  * 10 random distinct points in a 4-by-4 grid
  * 15 random distinct points in a 8-by-8 grid
  * 20 random distinct points in a 16-by-16 grid
  * 100 random distinct points in a 32-by-32 grid
  * 10000 random distinct points in a 65536-by-65536 grid
  ==> passed

Test 5d: insert general points; check nearest() with random query points
  * 10000 random general points in a 16-by-16 grid
  * 10000 random general points in a 128-by-128 grid
  * 10000 random general points in a 1024-by-1024 grid
  ==> passed

Test 6a: insert points from file; check nearest() with random query points
         and check traversal of kd-tree
  * input5.txt
  * input10.txt
  ==> passed

Test 6b: insert non-degenerate points; check nearest() with random query points
         and check traversal of kd-tree
  * 5 random non-degenerate points in a 8-by-8 grid
  * 10 random non-degenerate points in a 16-by-16 grid
  * 20 random non-degenerate points in a 32-by-32 grid
  * 30 random non-degenerate points in a 64-by-64 grid
  * 50 random non-degenerate points in a 128-by-128 grid
  * 1000 random non-degenerate points in a 2048-by-2048 grid
  ==> passed

Test 7: insert n random points; check that repeated calls to get(),
         range(), and nearest() with the same argument yield same results
  * 10 random general points in a 4-by-4 grid
  * 20 random general points in a 8-by-8 grid
  * 100 random general points in a 128-by-128 grid
  * 1000 random general points in a 65536-by-65536 grid
  ==> passed

Test 8a: check intermixed sequence of calls to insert(), isEmpty(),
         size(), contains(), range(), and nearest() with probabilities
         (p1, p2, p3, p4, p5, p6), respectively
  * 20000 calls with non-degenerate points in a 1-by-1 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
  * 20000 calls with non-degenerate points in a 16-by-16 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
  * 20000 calls with non-degenerate points in a 128-by-128 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
  * 20000 calls with non-degenerate points in a 1024-by-1024 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
  * 20000 calls with non-degenerate points in a 8192-by-8192 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
  * 20000 calls with non-degenerate points in a 65536-by-65536 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
    ==> passed

Test 8b: check intermixed sequence of calls to insert(), isEmpty(),
         size(), contains(), range(), and nearest() with probabilities
         (p1, p2, p3, p4, p5, p6), respectively
  * 20000 calls with distinct points in a 1-by-1 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
  * 20000 calls with distinct points in a 10-by-10 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
  * 20000 calls with distinct points in a 100-by-100 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
  * 20000 calls with distinct points in a 1000-by-1000 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
  * 20000 calls with distinct points in a 8192-by-8192 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
  * 20000 calls with distinct points in a 65536-by-65536 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
    ==> passed

Test 8c: check intermixed sequence of calls to insert(), isEmpty(),
         size(), contains(), range(), and nearest() with probabilities
         (p1, p2, p3, p4, p5, p6), respectively
  * 20000 calls with general points in a 1-by-1 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
  * 20000 calls with general points in a 10-by-10 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
  * 20000 calls with general points in a 100-by-100 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
  * 20000 calls with general points in a 1000-by-1000 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
  * 20000 calls with general points in a 8192-by-8192 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
  * 20000 calls with general points in a 65536-by-65536 grid
    and probabilities (0.3, 0.05, 0.05, 0.2, 0.2, 0.2)
    ==> passed

Test 9: check intermixed sequence of calls to insert(), isEmpty(),
        size(), contains(), range(), and nearest() with probabilities
        (p1=0, p2, p3, p4, p5, p6), respectively
        (data structure with 0 points)
  * 1000 calls with no points in a 1024-by-1024 grid
    and probabilities (0.0, 0.5, 0.5, 0.0, 0.0, 0.0)
  * 1000 calls with no points in a 1024-by-1024 grid
    and probabilities (0.0, 0.2, 0.2, 0.6, 0.0, 0.0)
  * 1000 calls with no points in a 1024-by-1024 grid
    and probabilities (0.0, 0.2, 0.2, 0.0, 0.6, 0.0)
  * 1000 calls with no points in a 1024-by-1024 grid
    and probabilities (0.0, 0.2, 0.2, 0.0, 0.0, 0.6)
  * 1000 calls with no points in a 1024-by-1024 grid
    and probabilities (0.0, 0.2, 0.2, 0.2, 0.2, 0.2)
    ==> passed

Test 10: check that two KdTree objects can be created at the same time
==> passed

Test 11: check that the specified exception is thrown with null arguments
  * argument to insert() is null
  * argument to contains() is null
  * argument to range() is null
  * argument to nearest() is null
  ==> passed


Total: 28/28 tests passed!


================================================================
********************************************************************************
*  MEMORY
********************************************************************************

Analyzing memory of Point2D
*-----------------------------------------------------------
Memory of Point2D object = 32 bytes
================================================================



Analyzing memory of RectHV
*-----------------------------------------------------------
Memory of RectHV object = 48 bytes
================================================================



Analyzing memory of PointSET
*-----------------------------------------------------------
Running 8 total tests.

Memory usage of a PointSET with n points (including Point2D and RectHV objects).
Maximum allowed memory is 96n + 200 bytes.

                 n       student (bytes)    reference (bytes)
--------------------------------------------------------------
=> passed        1          264                264
=> passed        2          360                360
=> passed        5          648                648
=> passed       10         1128               1128
=> passed       25         2568               2568
=> passed      100         9768               9768
=> passed      400        38568              38568
=> passed      800        76968              76968
==> 8/8 tests passed

Total: 8/8 tests passed!

Estimated student   memory (bytes) = 96.00 n + 168.00  (R^2 = 1.000)
Estimated reference memory (bytes) = 96.00 n + 168.00  (R^2 = 1.000)
================================================================



Analyzing memory of KdTree
*-----------------------------------------------------------
Running 8 total tests.

Memory usage of a KdTree with n points (including Point2D and RectHV objects).
Maximum allowed memory is 312n + 192 bytes.

                 n       student (bytes)    reference (bytes)
--------------------------------------------------------------
=> passed        1          160                160
=> passed        2          288                288
=> passed        5          672                672
=> passed       10         1312               1312
=> passed       25         3232               3232
=> passed      100        12832              12832
=> passed      400        51232              51232
=> passed      800       102432             102432
==> 8/8 tests passed

Total: 8/8 tests passed!

Estimated student   memory (bytes) = 128.00 n + 32.00  (R^2 = 1.000)
Estimated reference memory (bytes) = 128.00 n + 32.00  (R^2 = 1.000)
================================================================



********************************************************************************
*  TIMING
********************************************************************************

Timing PointSET
*-----------------------------------------------------------
Running 14 total tests.


Inserting n points into a PointSET

               n      ops per second
----------------------------------------
=> passed   160000    1302199         
=> passed   320000    1256710         
=> passed   640000     998546         
=> passed  1280000     815608         
==> 4/4 tests passed

Performing contains() queries after inserting n points into a PointSET

               n      ops per second
----------------------------------------
=> passed   160000     332601         
=> passed   320000     306565         
=> passed   640000     244809         
=> passed  1280000     342990         
==> 4/4 tests passed

Performing range() queries after inserting n points into a PointSET

               n      ops per second
----------------------------------------
=> passed    10000       3845         
=> passed    20000       1826         
=> passed    40000        746         
==> 3/3 tests passed

Performing nearest() queries after inserting n points into a PointSET

               n      ops per second
----------------------------------------
=> passed    10000       4598         
=> passed    20000       2175         
=> passed    40000        840         
==> 3/3 tests passed

Total: 14/14 tests passed!


================================================================



Timing KdTree
*-----------------------------------------------------------
Running 28 total tests.


Test 1a-d: Insert n points into a 2d tree. The table gives the average number of calls
           to methods in RectHV and Point per call to insert().

                                                                                                Point2D
               n      ops per second       RectHV()           x()               y()             equals()
----------------------------------------------------------------------------------------------------------------
=> passed   160000     520170               1.0              22.6              21.6              21.6         
=> passed   320000     732213               1.0              23.0              22.0              22.0         
=> passed   640000     618386               1.0              24.5              23.5              23.5         
=> passed  1280000     465407               1.0              26.6              25.6              25.6         
==> 4/4 tests passed


Test 2a-h: Perform contains() queries after inserting n points into a 2d tree. The table gives
           the average number of calls to methods in RectHV and Point per call to contains().

                                                                               Point2D
               n      ops per second       x()               y()               equals()
-----------------------------------------------------------------------------------------------
=> passed    10000     393577              37.0              35.0              18.0         
=> passed    20000     424268              39.3              37.3              19.2         
=> passed    40000     407660              43.6              41.6              21.3         
=> passed    80000     391136              44.0              42.0              21.5         
=> passed   160000     361360              46.5              44.5              22.7         
=> passed   320000     313174              50.1              48.1              24.5         
=> passed   640000     284361              51.4              49.4              25.2         
=> passed  1280000     254335              54.4              52.4              26.7         
==> 8/8 tests passed


Test 3a-h: Perform range() queries after inserting n points into a 2d tree. The table gives
           the average number of calls to methods in RectHV and Point per call to range().

               n      ops per second       intersects()      contains()        x()               y()
---------------------------------------------------------------------------------------------------------------
=> passed    10000     285882              49.4              31.1              50.1              12.1         
=> passed    20000     278497              51.7              32.6              53.3              16.2         
=> passed    40000     241327              63.9              39.3              63.1              14.1         
=> passed    80000     220469              66.1              40.7              65.2              14.9         
=> passed   160000     181388              69.0              42.5              70.9              20.4         
=> passed   320000     165317              66.0              40.2              65.2              15.7         
=> passed   640000     136557              71.0              43.3              70.7              19.2         
=> passed  1280000     116288              77.7              47.0              74.8              14.2         
==> 8/8 tests passed


Test 4a-h: Perform nearest() queries after inserting n points into a 2d tree. The table gives
           the average number of calls to methods in RectHV and Point per call to nearest().

                                         Point2D                 RectHV
               n      ops per second     distanceSquaredTo()     distanceSquaredTo()        x()               y()
------------------------------------------------------------------------------------------------------------------------
=> passed    10000   282144                 100.2                   50.7                   136.4             126.5         
=> passed    20000   278232                 110.3                   56.0                   148.6             141.0         
=> passed    40000   243956                 129.8                   66.1                   177.6             164.7         
=> passed    80000   232289                 133.0                   67.9                   174.1             176.6         
=> passed   160000   187825                 144.3                   73.8                   197.1             186.0         
=> passed   320000   140246                 150.8                   77.5                   199.7             200.7         
=> passed   640000   128042                 156.6                   80.4                   207.1             208.8         
=> passed  1280000    91742                 174.7                   89.7                   240.5             219.7         
==> 8/8 tests passed



Total: 28/28 tests passed!


================================================================

