# DSAINJAVA

Solving each question topic-wise. **One question = one Java file**, each with its own `main()` and sample input,
so any question can be run on its own (IntelliJ: open the file, click ▶ next to `main`).

Folders and files are numbered to follow the Prep Ledger: topic folders use the ledger's topic position
(`t01` Binary Search, `t04` LinkedList, `t05` Generic Tree, `t11` Recursion) and question files use the
question's number in that topic (`Q01_…`, `Q02_…`), so IntelliJ lists them in practice order.

Run from the project root — the Generic Tree inputs are read from `src/t05_genericTree/input` and `input2`.

Output is colourful via `src/t00_common/Console.java`: a title banner per question, `Console.result(label, value)`
for answers, `Console.check(label, actual, expected)` for ✔/✘ test checks, `Console.section(...)` for sub-headings
and `Console.todo(...)` on unsolved questions. Anything printed with `System.out` shows in cyan.

## Binary Search — `src/t01_binarySearch`
| Question | File |
|---|---|
| LC 1011. Capacity To Ship Packages Within D Days | `Q06_CapacityToShipPackagesWithinDDays` |

## Linked List — `src/t04_linkedList`
Shared: `Node`, `LinkedListUtils` (make list, print list).

| Question | File |
|---|---|
| LC 876. Middle of the Linked List | `Q01_MiddleOfLinkedList` |

## Generic Tree — `src/t05_genericTree`
📊 **Status, bugs and what to practise next:** [src/t05_genericTree/README.md](src/t05_genericTree/README.md)

Split into two subpackages: `src/t05_genericTree/solution/` (worked answers, listed below) and
`src/t05_genericTree/practice/` (fill-in-the-blank stubs that self-grade with `Console.check` on run).
The `input`/`input2` data files stay in `src/t05_genericTree/`.

Shared (in `solution/`): `Node`, `GenericTreeUtils` (read input, construct, display, clone).

| # | Question | File |
|---|---|---|
| 1 | Size of a Generic Tree | `Q01_SizeOfGenericTree` |
| 2 | Max in a Generic Tree | `Q02_MaxInGenericTree` |
| 3 | Height of a Generic Tree | `Q03_HeightOfGenericTree` |
| 4 | Pre & Post order traversals | `Q04_PreAndPostOrderTraversal` |
| 5, 6 | Level order traversal / linewise (LC 429) | `Q05_06_LevelOrderTraversal` |
| 7 | Mirror (LC 101) | `Q07_MirrorOfGenericTree` |
| 8 | Remove leaves (LC 1325) | `Q08_RemoveLeaves` |
| 9 | Linearize (LC 114) | `Q09_LinearizeGenericTree` |
| 10 | Find in Generic Tree (LC 257) | `Q10_FindInGenericTree` |
| 11 | Node to Root path | `Q11_NodeToRootPath` |
| 12 | Lowest Common Ancestor (LC 236) | `Q12_LowestCommonAncestor` |
| 13 | Distance between two nodes | `Q13_DistanceBetweenNodes` |
| 14 | Are trees similar in shape? — **TODO** | `Q14_AreTreesSimilarInShape` |
| 15 | Are trees mirror in shape? — **TODO** | `Q15_AreTreesMirrorInShape` |
| 16 | Multi Solver — **TODO** | `Q16_MultiSolver` |
| 17 | Predecessor & Successor — **TODO** | `Q17_PredecessorAndSuccessor` |
| 18 | Ceil & Floor — **TODO** | `Q18_CeilAndFloor` |
| 19 | Kth largest element — **TODO** | `Q19_KthLargestElement` |
| 20 | Diameter of a Generic Tree | `Q20_DiameterOfGenericTree` |
| 21 | Node with max subtree sum — **TODO** | `Q21_NodeWithMaxSubtreeSum` |
| 22 | Iterative preorder & postorder — **TODO** | `Q22_IterativePreAndPostOrder` |

## Recursion — `src/t11_recursion`
| # | Question | File |
|---|---|---|
| | **`s01_intro`** — principle of mathematical induction | |
| 1 | Print Decreasing | `Q01_PrintDecreasing` |
| 2 | Print Increasing | `Q02_PrintIncreasing` |
| 3 | Factorial | `Q03_Factorial` |
| 4 | Power (linear) | `Q04_PowerLinear` |
| 5 | Power (logarithmic) | `Q05_PowerLogarithmic` |
| 6 | Euler's path | `Q06_EulerPath` |
| 7 | Tower of Hanoi | `Q07_TowerOfHanoi` |
| | **`s02_arrays`** — recursion in arrays | |
| 8 | Display array | `Q08_DisplayArray` |
| 9 | Display array in reverse | `Q09_DisplayArrayReverse` |
| 10 | Max of an array | `Q10_MaxOfArray` |
| 11 | First index | `Q11_FirstIndex` |
| 12 | Last index | `Q12_LastIndex` |
| 13 | All indices | `Q13_AllIndices` |
| | **`s03_arraylist`** — recursion on the way down (returns the answers) | |
| 14 | Get all subsequences | `Q14_GetSubsequences` |
| 15 | Get keypad combinations | `Q15_GetKeypadCombinations` |
| 16 | Get stair paths | `Q16_GetStairPaths` |
| 17 | Get maze paths | `Q17_GetMazePaths` |
| 18 | Get maze paths with jumps | `Q18_GetMazePathsWithJumps` |
| | **`s04_onthewayup`** — recursion on the way up (prints the answers) | |
| 19 | Print subsequences | `Q19_PrintSubsequences` |
| 20 | Print keypad combinations | `Q20_PrintKeypadCombinations` |
| 21 | Print stair paths | `Q21_PrintStairPaths` |
| 22 | Print maze paths | `Q22_PrintMazePaths` |
| 23 | Print maze paths with jumps | `Q23_PrintMazePathsWithJumps` |
| 24 | Print permutations | `Q24_PrintPermutations` |
| 25 | Print encodings | `Q25_PrintEncodings` |
| | **`s05_backtracking`** | |
| 26 | Flood fill | `Q26_FloodFill` |
| 27 | Target sum subsets | `Q27_TargetSumSubsets` |
| 28 | N Queens | `Q28_NQueens` |
| 29 | Knight's tour | `Q29_KnightsTour` |

## Java Streams practice — `src/t13_streams` (not DSA)
| Question | File |
|---|---|
| Print duplicate elements | `Q01_FindDuplicates` |
| `"1:one,2:two"` → Map | `Q02_StringToMap` |
| Character frequency (streams vs HashMap) | `Q03_CharacterFrequency` |
