import AssemblyKeys._

name           := "ScalaColliderSwing"

version        := "1.6.0"

organization   := "de.sciss"

scalaVersion   := "2.10.1"

description := "A Swing and REPL front-end for ScalaCollider"

homepage <<= name { n => Some(url("https://github.com/Sciss/" + n)) }

licenses := Seq("GPL v2+" -> url("http://www.gnu.org/licenses/gpl-2.0.txt"))

libraryDependencies <<= version { v =>
  val i  = v.lastIndexOf('.') + 1
  val uv = v.substring(0, i) + "+"
  Seq(
    "de.sciss" %% "scalacollider" % uv,
    "de.sciss" %% "scalainterpreterpane" % "1.4.+",
    "de.sciss" % "prefuse-core" % "0.21",
    "de.sciss" %% "audiowidgets-swing" % "1.1.+"
  )
}

retrieveManaged := true

// this should make it possible to launch from sbt, but there is still a class path issue?
// fork in run := true

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

// ---- build info ----

buildInfoSettings

sourceGenerators in Compile <+= buildInfo

buildInfoKeys := Seq( name, organization, version, scalaVersion, description,
   BuildInfoKey.map( homepage ) { case (k, opt) => k -> opt.get },
   BuildInfoKey.map( licenses ) { case (_, Seq( (lic, _) )) => "license" -> lic }
)

buildInfoPackage := "de.sciss.synth.swing"

// ---- publishing ----

publishMavenStyle := true

publishTo <<= version { (v: String) =>
   Some( if( v.endsWith( "-SNAPSHOT" ))
      "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
   else
      "Sonatype Releases"  at "https://oss.sonatype.org/service/local/staging/deploy/maven2"
   )
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra <<= name { n =>
<scm>
  <url>git@github.com:Sciss/{n}.git</url>
  <connection>scm:git:git@github.com:Sciss/{n}.git</connection>
</scm>
<developers>
   <developer>
      <id>sciss</id>
      <name>Hanns Holger Rutz</name>
      <url>http://www.sciss.de</url>
   </developer>
</developers>
}

// ---- packaging ----

seq(assemblySettings: _*)

test in assembly := {}

seq(appbundle.settings: _*)

appbundle.icon := Some(file("application.icns"))

appbundle.target <<= baseDirectory

// ---- ls.implicit.ly ----

seq(lsSettings :_*)

(LsKeys.tags in LsKeys.lsync) := Seq("sound-synthesis", "sound", "music", "supercollider")

(LsKeys.ghUser in LsKeys.lsync) := Some("Sciss")

(LsKeys.ghRepo in LsKeys.lsync) <<= name(Some(_))

