# Assignment 3 - Bridge Pattern

**Student:** Zhakanov Sanzhar
**Group:** SE-2526
**Topic:** A - Drawing  
**Repository:** https://github.com/lonelysun21/SDP_3_assignment
**Base commit:** `c9c84c6`
**Submitted commit:** f187e7ec3b3857d77915dfbd2b2f6883ae83121c

## Project idea

This project demonstrates the **Bridge design pattern** by separating two independently varying hierarchies:

- **Abstraction hierarchy:** `Shape` -> `Circle`, `Square`
- **Implementation hierarchy:** `Renderer` -> `VectorRenderer`, `RasterRenderer`, `AsciiRenderer`

`Shape` stores a reference of type `Renderer`. `Circle` and `Square` delegate rendering to that interface instead of depending on concrete renderer classes.

## Role map

| Bridge role | Class | Source path |
|---|---|---|
| Abstraction | `Shape` | `src/Shape.java` |
| Refined Abstraction A1 | `Circle` | `src/Circle.java` |
| Refined Abstraction A2 | `Square` | `src/Square.java` |
| Implementor | `Renderer` | `src/Renderer.java` |
| Concrete Implementor I1 | `VectorRenderer` | `src/VectorRenderer.java` |
| Concrete Implementor I2 | `RasterRenderer` | `src/RasterRenderer.java` |
| Concrete Implementor I3 | `AsciiRenderer` | `src/AsciiRenderer.java` |
| Client / demo | `Main` | `src/Main.java` |

## Important Bridge locations

- **Bridge field:** `Shape.renderer` (`Renderer` reference)
- **Initial implementation:** passed to the `Shape` constructor
- **Main abstraction operation:** `execute()`
- **Runtime implementation replacement:** `setImplementation(Renderer renderer)`
- **Runtime switch demonstration:** T5 in `Main.java`

## Build and run

From the project root:

```bash
javac --release 17 -encoding UTF-8 -d out "@sources.txt"
java -cp out Main --demo
```

## Required checks

| Check | Combination / action | Expected result |
|---|---|---|
| T1 | `Circle` + `VectorRenderer` | `Vector rendering Circle with radius: 2` |
| T2 | `Circle` + `RasterRenderer` | `Raster rendering Circle with radius: 2` |
| T3 | `Square` + `VectorRenderer` | `Vector rendering Square with side: 3` |
| T4 | `Square` + `RasterRenderer` | `Raster rendering Square with side: 3` |
| T5 | Same `Circle` object: Vector -> Raster | Same object and unchanged ID/radius; output changes from Vector to Raster |
| T6 | `Circle` + `AsciiRenderer` | `Ascii rendering Circle with radius: 2` |
| T7 | `Square` + `AsciiRenderer` | `Ascii rendering Square with side: 3` |

The final demo must calculate PASS/FAIL from actual comparisons and end with:

```text
SUMMARY: 7/7 PASS
```

## Independent extension

The base version containing I1 (`VectorRenderer`), I2 (`RasterRenderer`), combinations T1-T4, and the runtime switch T5 was committed as:

```text
c9c84c6
```

After that, I3 (`AsciiRenderer`) was added without changing `Shape`, `Circle`, `Square`, `Renderer`, `VectorRenderer`, or `RasterRenderer`. Only the new I3 class and `Main.java` are expected to differ inside `src/`.

The extension diff is generated with:

```bash
git diff c9c84c6 HEAD -- src > extension.diff
```

## Bridge vs Adapter

Bridge is used here because the abstraction hierarchy (`Shape`) and implementation hierarchy (`Renderer`) are designed to vary independently. Adapter has a different intent: it makes an existing incompatible interface usable by a client that expects another interface.

## Submission files

The ZIP root should contain:

```text
src/
sources.txt
README.md
report.pdf
demo-output.txt
extension.diff
```
