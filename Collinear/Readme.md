

See the Assessment Guide for information on how to interpret this report.

ASSESSMENT SUMMARY

Compilation:  PASSED
API:          PASSED

Findbugs:     FAILED (5 warnings)
PMD:          PASSED
Checkstyle:   FAILED (0 errors, 36 warnings)

Correctness:  41/41 tests passed
Memory:       1/1 tests passed
Timing:       41/41 tests passed

Aggregate score: 100.00%
[Compilation: 5%, API: 5%, Findbugs: 0%, PMD: 0%, Checkstyle: 0%, Correctness: 60%, Memory: 10%, Timing: 20%]

ASSESSMENT DETAILS

The following files were submitted:
----------------------------------
3.7K Mar  6 13:09 BruteCollinearPoints.java
2.8K Mar  6 13:09 FastCollinearPoints.java
4.5K Mar  6 13:09 Point.java

********************************************************************************
*  COMPILING                                                                    
********************************************************************************


% javac Point.java
*-----------------------------------------------------------

% javac BruteCollinearPoints.java
*-----------------------------------------------------------

% javac FastCollinearPoints.java
*-----------------------------------------------------------


================================================================


Checking the APIs of your programs.
*-----------------------------------------------------------
Point:

BruteCollinearPoints:

FastCollinearPoints:

================================================================

********************************************************************************
*  CHECKING STYLE AND COMMON BUG PATTERNS                                       
********************************************************************************


% findbugs *.class
*-----------------------------------------------------------
L D FE_FLOATING_POINT_EQUALITY FE: Tests for exact floating-point equality. Because floating-point calculations may involve rounding, the calculated values may be imprecise.  At Point.java:[line 112]
L D NS_NON_SHORT_CIRCUIT NS: Questionable use of a non-short-circuit logic operator ('&' or '|'). Did you mean to use '&&' or '||' instead?  At Point.java:[line 69]
M V EI_EXPOSE_REP2 EI2: Stores a reference to an externally mutable object in the instance variable 'points', exposing the internal representation of the class 'BruteCollinearPoints'. Instead, create a defensive copy of the object referenced by the parameter variable 'points' and store that copy in the instance variable 'points'.   At BruteCollinearPoints.java:[line 13]
L D FE_FLOATING_POINT_EQUALITY FE: Tests for exact floating-point equality. Because floating-point calculations may involve rounding, the calculated values may be imprecise.  At BruteCollinearPoints.java:[line 24]
M V EI_EXPOSE_REP2 EI2: Stores a reference to an externally mutable object in the instance variable 'points', exposing the internal representation of the class 'FastCollinearPoints'. Instead, create a defensive copy of the object referenced by the parameter variable 'points' and store that copy in the instance variable 'points'.   At FastCollinearPoints.java:[line 13]
Warnings generated: 5


================================================================


% pmd .
*-----------------------------------------------------------
BruteCollinearPoints.java:9: The private instance (or static) variable 'points' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
BruteCollinearPoints.java:10: Can you replace the instance (or static) variable 'pointsCopy' with a local variable? [SingularField]
BruteCollinearPoints.java:10: The private instance (or static) variable 'pointsCopy' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
BruteCollinearPoints.java:11: The private instance (or static) variable 'lineSegments' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
FastCollinearPoints.java:9: The private instance (or static) variable 'points' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
FastCollinearPoints.java:10: Can you replace the instance (or static) variable 'pointsCopy' with a local variable? [SingularField]
FastCollinearPoints.java:10: The private instance (or static) variable 'pointsCopy' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
FastCollinearPoints.java:11: The private instance (or static) variable 'lineSegments' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
PMD ends with 8 warnings.


================================================================


% checkstyle *.java
*-----------------------------------------------------------
[WARN] BruteCollinearPoints.java:14:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] BruteCollinearPoints.java:19:12: 'for' is not followed by whitespace. [WhitespaceAfter]
[WARN] BruteCollinearPoints.java:20:16: 'for' is not followed by whitespace. [WhitespaceAfter]
[WARN] BruteCollinearPoints.java:22:20: 'for' is not followed by whitespace. [WhitespaceAfter]
[WARN] BruteCollinearPoints.java:24:23: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] BruteCollinearPoints.java:26:24: 'for' is not followed by whitespace. [WhitespaceAfter]
[WARN] BruteCollinearPoints.java:26:29: Do not use the letter 'l' as a local variable name. It is hard to distinguish from the number '1'. [LocalVariableName]
[WARN] BruteCollinearPoints.java:28:27: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] BruteCollinearPoints.java:51:12: 'for' is not followed by whitespace. [WhitespaceAfter]
[WARN] BruteCollinearPoints.java:52:15: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] BruteCollinearPoints.java:54:12: 'for' is not followed by whitespace. [WhitespaceAfter]
[WARN] BruteCollinearPoints.java:55:16: 'for' is not followed by whitespace. [WhitespaceAfter]
[WARN] BruteCollinearPoints.java:56:19: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] FastCollinearPoints.java:14:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] FastCollinearPoints.java:18:12: 'for' is not followed by whitespace. [WhitespaceAfter]
[WARN] FastCollinearPoints.java:21:16: 'for' is not followed by whitespace. [WhitespaceAfter]
[WARN] FastCollinearPoints.java:22:22: 'while' is not followed by whitespace. [WhitespaceAfter]
[WARN] FastCollinearPoints.java:24:29: Control variable 'last' is modified inside loop. [ModifiedControlVariable]
[WARN] FastCollinearPoints.java:25:19: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] FastCollinearPoints.java:38:12: 'for' is not followed by whitespace. [WhitespaceAfter]
[WARN] FastCollinearPoints.java:39:15: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] FastCollinearPoints.java:41:12: 'for' is not followed by whitespace. [WhitespaceAfter]
[WARN] FastCollinearPoints.java:42:16: 'for' is not followed by whitespace. [WhitespaceAfter]
[WARN] FastCollinearPoints.java:43:19: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Point.java:63:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Point.java:67:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Point.java:69:16: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Point.java:71:16: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Point.java:74:29: Typecast is not followed by whitespace. [WhitespaceAfter]
[WARN] Point.java:91:11: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Point.java:93:16: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Point.java:96:15: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Point.java:98:20: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Point.java:104:19: The class 'slopeCompare' must start with an uppercase letter and use CamelCase. [TypeName]
[WARN] Point.java:110:15: 'if' is not followed by whitespace. [WhitespaceAfter]
[WARN] Point.java:112:20: 'if' is not followed by whitespace. [WhitespaceAfter]
Checkstyle ends with 0 errors and 36 warnings.

% custom checkstyle checks for Point.java
*-----------------------------------------------------------

% custom checkstyle checks for BruteCollinearPoints.java
*-----------------------------------------------------------

% custom checkstyle checks for FastCollinearPoints.java
*-----------------------------------------------------------


================================================================

********************************************************************************
*  TESTING CORRECTNESS
********************************************************************************

Testing correctness of Point
*-----------------------------------------------------------
Running 3 total tests.

Test 1: p.slopeTo(q)
  * positive infinite slope, where p and q have coordinates in [0, 500)
  * positive infinite slope, where p and q have coordinates in [0, 32768)
  * negative infinite slope, where p and q have coordinates in [0, 500)
  * negative infinite slope, where p and q have coordinates in [0, 32768)
  * positive zero     slope, where p and q have coordinates in [0, 500)
  * positive zero     slope, where p and q have coordinates in [0, 32768)
  * symmetric for random points p and q with coordinates in [0, 500)
  * symmetric for random points p and q with coordinates in [0, 32768)
  * transitive for random points p, q, and r with coordinates in [0, 500)
  * transitive for random points p, q, and r with coordinates in [0, 32768)
  * slopeTo(), where p and q have coordinates in [0, 500)
  * slopeTo(), where p and q have coordinates in [0, 32768)
  * slopeTo(), where p and q have coordinates in [0, 10)
  * throw a java.lang.NullPointerException if argument is null
  ==> passed

Test 2: p.compareTo(q)
  * reflexive, where p and q have coordinates in [0, 500)
  * reflexive, where p and q have coordinates in [0, 32768)
  * antisymmetric, where p and q have coordinates in [0, 500)
  * antisymmetric, where p and q have coordinates in [0, 32768)
  * transitive, where p, q, and r have coordinates in [0, 500)
  * transitive, where p, q, and r have coordinates in [0, 32768)
  * sign of compareTo(), where p and q have coordinates in [0, 500)
  * sign of compareTo(), where p and q have coordinates in [0, 32768)
  * sign of compareTo(), where p and q have coordinates in [0, 10)
  * throw java.lang.NullPointerException exception if argument is null
  ==> passed

Test 3: p.slopeOrder().compare(q, r)
  * reflexive, where p and q have coordinates in [0, 500)
  * reflexive, where p and q have coordinates in [0, 32768)
  * antisymmetric, where p, q, and r have coordinates in [0, 500)
  * antisymmetric, where p, q, and r have coordinates in [0, 32768)
  * transitive, where p, q, r, and s have coordinates in [0, 500)
  * transitive, where p, q, r, and s have coordinates in [0, 32768)
  * sign of compare(), where p, q, and r have coordinates in [0, 500)
  * sign of compare(), where p, q, and r have coordinates in [0, 32768)
  * sign of compare(), where p, q, and r have coordinates in [0, 10)
  * throw java.lang.NullPointerException if either argument is null
  ==> passed


Total: 3/3 tests passed!


================================================================
********************************************************************************
*  TESTING CORRECTNESS (substituting reference Point and LineSegment)
********************************************************************************

Testing correctness of BruteCollinearPoints
*-----------------------------------------------------------
Running 17 total tests.

The inputs satisfy the following conditions:
  - no duplicate points
  - no 5 (or more) points are collinear
  - all x- and y-coordinates between 0 and 32,767

Test 1: points from a file
  * filename = input8.txt
  * filename = equidistant.txt
  * filename = input40.txt
  * filename = input48.txt
  ==> passed

Test 2a: points from a file with horizontal line segments
  * filename = horizontal5.txt
  * filename = horizontal25.txt
  ==> passed

Test 2b: random horizontal line segments
  *  1 random horizontal line segment
  *  5 random horizontal line segments
  *  10 random horizontal line segments
  *  15 random horizontal line segments
  ==> passed

Test 3a: points from a file with vertical line segments
  * filename = vertical5.txt
  * filename = vertical25.txt
  ==> passed

Test 3b: random vertical line segments
  *  1 random vertical line segment
  *  5 random vertical line segments
  *  10 random vertical line segments
  *  15 random vertical line segments
  ==> passed

Test 4a: points from a file with no line segments
  * filename = random23.txt
  * filename = random38.txt
  ==> passed

Test 4b: random points with no line segments
  *  5 random points
  *  10 random points
  *  20 random points
  *  50 random points
  ==> passed

Test 5: points from a file with fewer than 4 points
  * filename = input1.txt
  * filename = input2.txt
  * filename = input3.txt
  ==> passed

Test 6: check for dependence on either compareTo() or compare()
        returning { -1, +1, 0 } instead of { negative integer,
        positive integer, zero }
  * filename = equidistant.txt
  * filename = input40.txt
  * filename = input48.txt
  ==> passed

Test 7: check for fragile dependence on return value of toString()
  * filename = equidistant.txt
  * filename = input40.txt
  * filename = input48.txt
  ==> passed

Test 8: random line segments, none vertical or horizontal
  *  1 random line segment
  *  5 random line segments
  *  10 random line segments
  *  15 random line segments
  ==> passed

Test 9: random line segments
  *  1 random line segment
  *  5 random line segments
  *  10 random line segments
  *  15 random line segments
  ==> passed

Test 10: check that data type is immutable by testing whether each method
         returns the same value, regardless of any intervening operations
  * input8.txt
  * equidistant.txt
  ==> passed

Test 11: check that data type does not mutate the constructor argument
  * input8.txt
  * equidistant.txt
  ==> passed

Test 12: numberOfSegments() is consistent with segments()
  * filename = input8.txt
  * filename = equidistant.txt
  * filename = input40.txt
  * filename = input48.txt
  * filename = horizontal5.txt
  * filename = vertical5.txt
  * filename = random23.txt
  ==> passed

Test 13: throws an exception if either the constructor argument is null
         or any entry in array is null
  * argument is null
  * Point[] of length 10, number of null entries = 1
  * Point[] of length 10, number of null entries = 10
  * Point[] of length 4, number of null entries = 1
  * Point[] of length 3, number of null entries = 1
  * Point[] of length 2, number of null entries = 1
  * Point[] of length 1, number of null entries = 1
  ==> passed

Test 14: check that the constructor throws an exception if duplicate points
  * 50 points
  * 25 points
  * 5 points
  * 4 points
  * 3 points
  * 2 points
  ==> passed


Total: 17/17 tests passed!


================================================================
Testing correctness of FastCollinearPoints
*-----------------------------------------------------------
Running 21 total tests.

The inputs satisfy the following conditions:
  - no duplicate points
  - all x- and y-coordinates between 0 and 32,767

Test 1: points from a file
  * filename = input8.txt
  * filename = equidistant.txt
  * filename = input40.txt
  * filename = input48.txt
  * filename = input299.txt
  ==> passed

Test 2a: points from a file with horizontal line segments
  * filename = horizontal5.txt
  * filename = horizontal25.txt
  * filename = horizontal50.txt
  * filename = horizontal75.txt
  * filename = horizontal100.txt
  ==> passed

Test 2b: random horizontal line segments
  *  1 random horizontal line segment
  *  5 random horizontal line segments
  *  10 random horizontal line segments
  *  15 random horizontal line segments
  ==> passed

Test 3a: points from a file with vertical line segments
  * filename = vertical5.txt
  * filename = vertical25.txt
  * filename = vertical50.txt
  * filename = vertical75.txt
  * filename = vertical100.txt
  ==> passed

Test 3b: random vertical line segments
  *  1 random vertical line segment
  *  5 random vertical line segments
  *  10 random vertical line segments
  *  15 random vertical line segments
  ==> passed

Test 4a: points from a file with no line segments
  * filename = random23.txt
  * filename = random38.txt
  * filename = random91.txt
  * filename = random152.txt
  ==> passed

Test 4b: random points with no line segments
  *  5 random points
  *  10 random points
  *  20 random points
  *  50 random points
  ==> passed

Test 5a: points from a file with 5 or more on some line segments
  * filename = input9.txt
  * filename = input10.txt
  * filename = input20.txt
  * filename = input50.txt
  * filename = input80.txt
  * filename = input300.txt
  * filename = inarow.txt
  ==> passed

Test 5b: points from a file with 5 or more on some line segments
  * filename = kw1260.txt
  * filename = rs1423.txt
  ==> passed

Test 6: points from a file with fewer than 4 points
  * filename = input1.txt
  * filename = input2.txt
  * filename = input3.txt
  ==> passed

Test 7: check for dependence on either compareTo() or compare()
        returning { -1, +1, 0 } instead of { negative integer,
        positive integer, zero }
  * filename = equidistant.txt
  * filename = input40.txt
  * filename = input48.txt
  * filename = input299.txt
  ==> passed

Test 8: check for fragile dependence on return value of toString()
  * filename = equidistant.txt
  * filename = input40.txt
  * filename = input48.txt
  ==> passed

Test 9: random line segments, none vertical or horizontal
  *  1 random line segment
  *  5 random line segments
  *  25 random line segments
  *  50 random line segments
  *  100 random line segments
  ==> passed

Test 10: random line segments
  *  1 random line segment
  *  5 random line segments
  *  25 random line segments
  *  50 random line segments
  *  100 random line segments
  ==> passed

Test 11: random distinct points in a given range
  * 5 random points in a 10-by-10 grid
  * 10 random points in a 10-by-10 grid
  * 50 random points in a 10-by-10 grid
  * 90 random points in a 10-by-10 grid
  * 200 random points in a 50-by-50 grid
  ==> passed

Test 12: m*n points on an m-by-n grid
  * 3-by-3 grid
  * 4-by-4 grid
  * 5-by-5 grid
  * 10-by-10 grid
  * 20-by-20 grid
  * 5-by-4 grid
  * 6-by-4 grid
  * 10-by-4 grid
  * 15-by-4 grid
  * 25-by-4 grid
  ==> passed

Test 13: check that data type is immutable by testing whether each method
         returns the same value, regardless of any intervening operations
  * input8.txt
  * equidistant.txt
  ==> passed

Test 14: check that data type does not mutate the constructor argument
  * input8.txt
  * equidistant.txt
  ==> passed

Test 15: numberOfSegments() is consistent with segments()
  * filename = input8.txt
  * filename = equidistant.txt
  * filename = input40.txt
  * filename = input48.txt
  * filename = horizontal5.txt
  * filename = vertical5.txt
  * filename = random23.txt
  ==> passed

Test 16: throws an exception if either constructor argument is null
         or any entry in array is null
  * argument is null
  * Point[] of length 10, number of null entries = 1
  * Point[] of length 10, number of null entries = 10
  * Point[] of length 4, number of null entries = 1
  * Point[] of length 3, number of null entries = 1
  * Point[] of length 2, number of null entries = 1
  * Point[] of length 1, number of null entries = 1
  ==> passed

Test 17: check that the constructor throws an exception if duplicate points
  * 50 points
  * 25 points
  * 5 points
  * 4 points
  * 3 points
  * 2 points
  ==> passed


Total: 21/21 tests passed!


================================================================
********************************************************************************
*  MEMORY
********************************************************************************

Analyzing memory of Point
*-----------------------------------------------------------
Running 1 total tests.

The maximum amount of memory per Point object is 32 bytes.

Student memory = 24 bytes (passed)

Total: 1/1 tests passed!

================================================================



********************************************************************************
*  TIMING
********************************************************************************

Timing BruteCollinearPoints
*-----------------------------------------------------------
Running 10 total tests.

Test 1a-1e: Find collinear points among n random distinct points


                                                      slopeTo()
             n    time     slopeTo()   compare()  + 2*compare()        compareTo()
-----------------------------------------------------------------------------------------------
=> passed    16   0.00         546           0            546                  120         
=> passed    32   0.00        4930           0           4930                  496         
=> passed    64   0.00       41602           0          41602                 2016         
=> passed   128   0.01      341250           0         341250                 8128         
=> passed   256   0.05     2763266           0        2763266                32640         
==> 5/5 tests passed

Test 2a-2e: Find collinear points among n/4 arbitrary line segments


                                                      slopeTo()
             n    time     slopeTo()   compare()  + 2*compare()        compareTo()
-----------------------------------------------------------------------------------------------
=> passed    16   0.00         588           0            588                  144         
=> passed    32   0.00        5174           0           5174                  544         
=> passed    64   0.00       42614           0          42614                 2112         
=> passed   128   0.01      345200           0         345200                 8320         
=> passed   256   0.03     2778727           0        2778727                33024         
==> 5/5 tests passed

Total: 10/10 tests passed!


================================================================



Timing FastCollinearPoints
*-----------------------------------------------------------
Running 31 total tests.

Test 1a-1g: Find collinear points among n random distinct points


                                                      slopeTo()
             n    time     slopeTo()   compare()  + 2*compare()        compareTo()
-----------------------------------------------------------------------------------------------
=> passed    64   0.01        7564       17813          43190                19888         
=> passed   128   0.02       31500       87063         205626                96050         
=> passed   256   0.07      128524      409749         948022               441740         
=> passed   512   0.28      519180     1883748        4286676              2015662         
=> passed  1024   0.52     2086924     8513098       19113120              9061176         
=> passed  2048   1.55     8368140    38058144       84484428             40242150         
==> 6/6 tests passed

lg ratio(slopeTo() + 2*compare()) = lg (84484428 / 19113120) = 2.14
=> passed

==> 7/7 tests passed

Test 2a-2g: Find collinear points among the n points on an n-by-1 grid

                                                      slopeTo()
             n    time     slopeTo()   compare()  + 2*compare()        compareTo()
-----------------------------------------------------------------------------------------------
=> passed    64   0.00        7564        4566          16696                 8776         
=> passed   128   0.00       31500       17406          66312                30689         
=> passed   256   0.00      128524       67943         264410               111778         
=> passed   512   0.01      519180      267857        1054894               422219         
=> passed  1024   0.04     2086924     1061948        4210820              1634456         
=> passed  2048   0.11     8368140     4225064       16818268              6421369         
=> passed  4096   0.39    33513484    16846869       67207222             25438541         
==> 7/7 tests passed

lg ratio(slopeTo() + 2*compare()) = lg (67207222 / 16818268) = 2.00
=> passed

==> 8/8 tests passed

Test 3a-3g: Find collinear points among the n points on an n/4-by-4 grid

                                                      slopeTo()
             n    time     slopeTo()   compare()  + 2*compare()        compareTo()
-----------------------------------------------------------------------------------------------
=> passed    64   0.00        7564       14386          36336                18266         
=> passed   128   0.00       31500       42920         117340                70781         
=> passed   256   0.01      128524      147881         424286               274304         
=> passed   512   0.03      519180      544828        1608836              1069116         
=> passed  1024   0.11     2086924     2081014        6248952              4200479         
=> passed  2048   0.33     8368140     8109673       24587486             16584552         
=> passed  4096   1.60    33513484    31965619       97444722             65794191         
==> 7/7 tests passed

lg ratio(slopeTo() + 2*compare()) = lg (97444722 / 24587486) = 1.99
=> passed

==> 8/8 tests passed

Test 4a-4g: Find collinear points among the n points on an n/8-by-8 grid

                                                      slopeTo()
             n    time     slopeTo()   compare()  + 2*compare()        compareTo()
-----------------------------------------------------------------------------------------------
=> passed    64   0.00        7564       17251          42066                20185         
=> passed   128   0.01       31500       74449         180398                91725         
=> passed   256   0.02      128524      229652         587828               369342         
=> passed   512   0.07      519180      849527        2218234              1464683         
=> passed  1024   0.21     2086924     3251178        8589280              5826309         
=> passed  2048   0.57     8368140    12679845       33727830             23235688         
=> passed  4096   2.31    33513484    50004769      133523022             92686386         
==> 7/7 tests passed

lg ratio(slopeTo() + 2*compare()) = lg (133523022 / 33727830) = 1.99
=> passed

==> 8/8 tests passed

Total: 31/31 tests passed!


================================================================



