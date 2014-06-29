# ScalaCollider-Swing

(experimental app branch)

## statement

ScalaCollider-Swing is a Swing GUI front-end for ScalaCollider. (C)opyright 2008-2014 by Hanns Holger Rutz. All rights reserved. It is released under the [GNU General Public License](http://github.com/Sciss/ScalaColliderSwing/blob/master/licenses/ScalaColliderSwing-License.txt) v3+ and comes with absolutely no warranties. To contact the author, send an email to `contact at sciss.de`.

## requirements / building

ScalaCollider-Swing compiles against Scala 2.10 using sbt 0.13.

-`sbt assembly` creates a fully self-contained jar (platform neutral)
-`sbt appbundle` creates an Mac OS X application bundle

A the `sbt` shell script by [paulp](https://github.com/paulp/sbt-extras), made available under a BSD-style license, is now included. So if you do not want to install `sbt` directly on your system, you can just use that script: `./sbt`.

To link to ScalaCollider-Swing:

    "de.sciss" %% "scalacolliderswing" % v

Or just to some sub-modules:

    "de.sciss" %% "scalacolliderswing-core"        % v  // only the core library extentions
    "de.sciss" %% "scalacolliderswing-interpreter" % v  // plus the Scala REPL
    "de.sciss" %% "scalacolliderswing-app"         % v  // plus the desktop IDE

The current stable version `v` is `"1.17.+"`.

## running

The standalone jar, created via `sbt assembly` produces `ScalaCollider.jar` which is double-clickable and can be run via:

    $ java -jar ScalaCollider.jar

A Linux desktop template is included. You will have to edit this file to change the installation path. Future versions may simplify this procedure or provide a direct `.deb` package.

## documentation

 - There is a small screencast intro at [www.screencast.com/t/YjUwNDZjMT](http://www.screencast.com/t/YjUwNDZjMT)
 - ScalaCollider was also presented at [Scala Days 2012](http://skillsmatter.com/podcast/scala/scalacollider)

### GUI commands

The GUI extensions are available by calling the special `.gui` method on supported objects. The extensions are imported with `import de.sciss.synth.swing.Implicits._`.

```scala

    // server
    s.gui.meter()               // show peak meters for main I/O
    s.gui.tree()                // show node tree for server's root group

    // group
    someGroup.gui.tree()        // show node tree with a given group as root

    // audio-bus
    someBus.gui.meter()         // show peak meters for the given bus
    someBus.gui.waveform(dur)   // record and plot bus output for duration in seconds

    // graph functions
    val fun = gui {             // use `gui { ... }` instead of `play { ... }` to capture function
      PinkNoise.ar
    }
    fun.waveform(dur)           // record and plot graph function for duration in seconds
```

Experimental support for JFreeChart is added (app sub-project only). Extensions are imported with `import de.sciss.synth.swing.Plotting`.

```scala

    Vector.fill(200)(random).plot()                 // 1D plot, lines
    Vector.fill(100)(random).plot(discrete = true)  // 1D plot, sample-and-hold

    Vector.tabulate(316) { i => (i * 0.003 * 0.2).cos -> (i * 0.025).sin } .plot()  // 2D plot, scatter

    Vector.fill(3)(Vector.fill(100)(random-random).integrate).plot() // multiple 1D plots
```

Chart properties and export to PNG and PDF are available through a context menu.

## download

The current version can be downloaded from [github.com/Sciss/ScalaColliderSwing](http://github.com/Sciss/ScalaColliderSwing).
