/*
 *  Shapes.scala
 *  (ScalaCollider-Swing)
 *
 *  Copyright (c) 2008-2016 Hanns Holger Rutz. All rights reserved.
 *
 *  This software is published under the GNU General Public License v3+
 *
 *
 *  For further information, please contact Hanns Holger Rutz at
 *  contact@sciss.de
 */

package de.sciss.synth.swing

import java.awt.{RenderingHints, Graphics, Shape, Color, Paint, BasicStroke}
import java.awt.geom.{AffineTransform, Path2D}

import scala.swing.Graphics2D

object Shapes {
  /** Creates an icon from a given shape function. */
  def Icon(extent: Int = 32, fill: Paint = Color.black)(fun: Path2D => Unit): javax.swing.Icon = {
    val p = new Path2D.Float(Path2D.WIND_EVEN_ODD)
    fun(p)
    p.closePath()
    val shape = if (extent == 32) p else {
      val scale = extent/32f
      AffineTransform.getScaleInstance(scale, scale).createTransformedShape(p)
    }

    new IconImpl(extent, shape, fill)
  }

  private final class IconImpl(extent: Int, shape: Shape, fill: Paint) extends javax.swing.Icon {
    def paintIcon(c: java.awt.Component, g: Graphics, x: Int, y: Int): Unit = {
      val g2    = g.asInstanceOf[Graphics2D]
      val hints = g2.getRenderingHints
      val at    = g2.getTransform
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING  , RenderingHints.VALUE_ANTIALIAS_ON)
      // g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_NORMALIZE)
      g2.translate(x, y)
      g2.setPaint(fill)
      g2.fill(shape)
      g2.setTransform(at)
      g2.setRenderingHints(hints)
    }

    def getIconWidth : Int = extent
    def getIconHeight: Int = extent
  }

  // ---- core ----

  def Group(p: Path2D): Unit = {
    p.moveTo(6.77607f, 15.77078f)
    p.lineTo(6.53977f, 17.91951f)
    p.lineTo(6.59067f, 18.17527f)
    p.lineTo(4.82306f, 19.35746f)
    p.lineTo(4.60596f, 19.2124f)
    p.lineTo(2.52966f, 18.6085f)
    p.lineTo(1.8073499f, 19.68952f)
    p.lineTo(3.15947f, 21.3748f)
    p.lineTo(3.3784401f, 21.51949f)
    p.lineTo(3.37877f, 21.52149f)
    p.lineTo(2.96299f, 23.60695f)
    p.lineTo(2.70724f, 23.65785f)
    p.lineTo(0.8125001f, 24.69844f)
    p.lineTo(1.0657401f, 25.9716f)
    p.lineTo(3.2144802f, 26.2079f)
    p.lineTo(3.47023f, 26.157f)
    p.lineTo(4.65243f, 27.924599f)
    p.curveTo(4.65265f, 27.92516f, 4.65245f, 27.925598f, 4.65276f, 27.9266f)
    p.lineTo(4.50583f, 28.14407f)
    p.lineTo(3.9015598f, 30.21851f)
    p.lineTo(4.9825697f, 30.940819f)
    p.lineTo(6.6697297f, 29.588318f)
    p.lineTo(6.81479f, 29.371218f)
    p.lineTo(8.9002495f, 29.786997f)
    p.lineTo(8.951449f, 30.044617f)
    p.lineTo(9.99167f, 31.937496f)
    p.lineTo(11.2667f, 31.683867f)
    p.lineTo(11.50336f, 29.537006f)
    p.lineTo(11.45216f, 29.279387f)
    p.lineTo(13.21976f, 28.097187f)
    p.curveTo(13.22026f, 28.097187f, 13.22076f, 28.097246f, 13.22176f, 28.096638f)
    p.lineTo(13.43923f, 28.243568f)
    p.lineTo(15.5133f, 28.845978f)
    p.lineTo(16.23561f, 27.764957f)
    p.lineTo(14.883849f, 26.081537f)
    p.lineTo(14.666389f, 25.934607f)
    p.lineTo(15.079929f, 23.847647f)
    p.lineTo(15.339409f, 23.796047f)
    p.lineTo(17.23042f, 22.756197f)
    p.lineTo(16.977179f, 21.483047f)
    p.lineTo(14.832178f, 21.245998f)
    p.lineTo(14.572688f, 21.297598f)
    p.lineTo(13.391988f, 19.527758f)
    p.lineTo(13.536668f, 19.308788f)
    p.lineTo(14.141317f, 17.236217f)
    p.lineTo(13.060297f, 16.513908f)
    p.lineTo(11.374637f, 17.864178f)
    p.lineTo(11.229957f, 18.083138f)
    p.curveTo(11.229397f, 18.083138f, 11.228956f, 18.083687f, 11.227957f, 18.083687f)
    p.lineTo(9.14249f, 17.66791f)
    p.lineTo(9.09159f, 17.41216f)
    p.lineTo(8.051f, 15.51741f)
    p.lineTo(6.77598f, 15.77103f)
    p.lineTo(6.77607f, 15.77078f)
    p.moveTo(7.9552402f, 19.006119f)
    p.curveTo(7.9957404f, 18.997118f, 8.03744f, 18.98972f, 8.07845f, 18.981619f)
    p.curveTo(10.69999f, 18.46015f, 13.24631f, 20.161549f, 13.76776f, 22.783089f)
    p.curveTo(14.28922f, 25.404629f, 12.588201f, 27.952808f, 9.9666605f, 28.47427f)
    p.curveTo(7.3451104f, 28.99573f, 4.7965603f, 27.29284f, 4.2751007f, 24.671299f)
    p.curveTo(3.7618008f, 22.09072f, 5.4032407f, 19.581299f, 7.9552407f, 19.006119f)
    p.lineTo(7.9552402f, 19.006119f)
    p.moveTo(8.6956005f, 22.084229f)
    p.curveTo(7.7886906f, 22.264618f, 7.1991906f, 23.146868f, 7.3795905f, 24.053778f)
    p.curveTo(7.5599804f, 24.960678f, 8.44223f, 25.550179f, 9.34914f, 25.369787f)
    p.curveTo(10.256041f, 25.189398f, 10.84368f, 24.307518f, 10.6632805f, 23.400608f)
    p.curveTo(10.48289f, 22.49371f, 9.6025f, 21.90383f, 8.6956f, 22.08423f)
    p.lineTo(8.6956005f, 22.084229f)

    p.moveTo(19.1084f, 15.31646f)
    p.lineTo(19.65522f, 17.19563f)
    p.lineTo(19.78638f, 17.391918f)
    p.lineTo(18.71747f, 18.993177f)
    p.lineTo(18.48562f, 18.947077f)
    p.lineTo(16.53967f, 19.161316f)
    p.lineTo(16.310032f, 20.315786f)
    p.lineTo(18.024912f, 21.256977f)
    p.lineTo(18.258192f, 21.302177f)
    p.lineTo(18.259123f, 21.303177f)
    p.lineTo(18.633892f, 23.191607f)
    p.lineTo(18.437592f, 23.322767f)
    p.lineTo(17.213272f, 24.849638f)
    p.lineTo(17.866201f, 25.826818f)
    p.lineTo(19.74537f, 25.279999f)
    p.lineTo(19.941671f, 25.148838f)
    p.lineTo(21.542942f, 26.217758f)
    p.curveTo(21.543322f, 26.217758f, 21.543491f, 26.218758f, 21.543861f, 26.218758f)
    p.lineTo(21.496262f, 26.451567f)
    p.lineTo(21.70955f, 28.396088f)
    p.lineTo(22.86401f, 28.625729f)
    p.lineTo(23.80663f, 26.90989f)
    p.lineTo(23.85273f, 26.67804f)
    p.lineTo(25.74116f, 26.30327f)
    p.lineTo(25.87328f, 26.501f)
    p.lineTo(27.399189f, 27.72389f)
    p.lineTo(28.37781f, 27.07f)
    p.lineTo(27.83195f, 25.192259f)
    p.lineTo(27.69983f, 24.99453f)
    p.lineTo(28.76874f, 23.39327f)
    p.curveTo(28.768959f, 23.392721f, 28.76974f, 23.392721f, 28.76974f, 23.39233f)
    p.lineTo(29.002548f, 23.43993f)
    p.lineTo(30.946108f, 23.22521f)
    p.lineTo(31.175747f, 22.07074f)
    p.lineTo(29.461817f, 21.13099f)
    p.lineTo(29.229008f, 21.08339f)
    p.lineTo(28.851849f, 19.194479f)
    p.lineTo(29.051018f, 19.061409f)
    p.lineTo(30.272469f, 17.53645f)
    p.lineTo(29.61954f, 16.559269f)
    p.lineTo(27.743238f, 17.10417f)
    p.lineTo(27.54407f, 17.23725f)
    p.lineTo(25.94328f, 16.165949f)
    p.lineTo(25.98848f, 15.932659f)
    p.lineTo(25.77616f, 13.989569f)
    p.lineTo(24.621689f, 13.759939f)
    p.lineTo(23.679548f, 15.473379f)
    p.lineTo(23.634348f, 15.706669f)
    p.curveTo(23.633848f, 15.706698f, 23.633368f, 15.707499f, 23.633348f, 15.707609f)
    p.lineTo(21.744919f, 16.082369f)
    p.lineTo(21.613758f, 15.886069f)
    p.lineTo(20.086887f, 14.661759f)
    p.lineTo(19.108267f, 15.315649f)
    p.lineTo(19.1084f, 15.31646f)
    p.moveTo(21.21566f, 17.6141f)
    p.curveTo(21.24636f, 17.5924f, 21.27876f, 17.5719f, 21.31026f, 17.5509f)
    p.curveTo(23.32237f, 16.20644f, 26.0417f, 16.747349f, 27.38615f, 18.75947f)
    p.curveTo(28.7306f, 20.77158f, 28.19065f, 23.49235f, 26.178541f, 24.8368f)
    p.curveTo(24.166431f, 26.18125f, 21.444702f, 25.63986f, 20.10025f, 23.62775f)
    p.curveTo(18.77681f, 21.64708f, 19.280361f, 18.97937f, 21.21569f, 17.61408f)
    p.lineTo(21.21566f, 17.6141f)
    p.moveTo(22.90139f, 19.93227f)
    p.curveTo(22.20532f, 20.39737f, 22.0179f, 21.33957f, 22.48301f, 22.03564f)
    p.curveTo(22.948109f, 22.73172f, 23.890308f, 22.91914f, 24.58638f, 22.454031f)
    p.curveTo(25.28246f, 21.988932f, 25.46844f, 21.047682f, 25.00334f, 20.35161f)
    p.curveTo(24.53824f, 19.65554f, 23.59747f, 19.46716f, 22.90139f, 19.93227f)
    p.lineTo(22.90139f, 19.93227f)

    p.moveTo(6.78337f, 11.24682f)
    p.lineTo(9.09483f, 11.501f)
    p.lineTo(9.369949f, 11.4463005f)
    p.lineTo(10.641689f, 13.347771f)
    p.lineTo(10.48564f, 13.58131f)
    p.lineTo(9.8359995f, 15.81486f)
    p.lineTo(10.99889f, 16.591871f)
    p.lineTo(12.81181f, 15.1373415f)
    p.lineTo(12.967449f, 14.901792f)
    p.lineTo(12.969449f, 14.901241f)
    p.lineTo(15.212839f, 15.348512f)
    p.lineTo(15.267539f, 15.6236315f)
    p.lineTo(16.38694f, 17.661871f)
    p.lineTo(17.75652f, 17.38945f)
    p.lineTo(18.0107f, 15.07798f)
    p.lineTo(17.956f, 14.80286f)
    p.lineTo(19.85747f, 13.53113f)
    p.curveTo(19.857859f, 13.53113f, 19.85947f, 13.53109f, 19.85947f, 13.53057f)
    p.lineTo(20.093401f, 13.68863f)
    p.lineTo(22.324951f, 14.33867f)
    p.lineTo(23.101961f, 13.17579f)
    p.lineTo(21.647032f, 11.36086f)
    p.lineTo(21.413492f, 11.20481f)
    p.lineTo(21.860762f, 8.9614105f)
    p.lineTo(22.137892f, 8.90631f)
    p.lineTo(24.174122f, 7.78732f)
    p.lineTo(23.90129f, 6.41573f)
    p.lineTo(21.59184f, 6.16114f)
    p.lineTo(21.31471f, 6.21624f)
    p.lineTo(20.04298f, 4.3147697f)
    p.curveTo(20.04276f, 4.31421f, 20.04302f, 4.31277f, 20.04265f, 4.31277f)
    p.lineTo(20.2007f, 4.07884f)
    p.lineTo(20.84873f, 1.84769f)
    p.lineTo(19.68584f, 1.07068f)
    p.lineTo(17.87493f, 2.52481f)
    p.lineTo(17.71688f, 2.75875f)
    p.lineTo(15.47187f, 2.31389f)
    p.lineTo(15.41637f, 2.03475f)
    p.lineTo(14.29776f, 5.3E-4f)
    p.lineTo(12.92819f, 0.27296f)
    p.lineTo(12.6732f, 2.58041f)
    p.lineTo(12.7287f, 2.85954f)
    p.lineTo(10.82482f, 4.12966f)
    p.lineTo(10.58928f, 3.97402f)
    p.lineTo(8.35974f, 3.32358f)
    p.lineTo(7.58273f, 4.48647f)
    p.lineTo(9.03525f, 6.29978f)
    p.lineTo(9.2708f, 6.45543f)
    p.curveTo(9.27063f, 6.45604f, 9.27129f, 6.45643f, 9.27113f, 6.45743f)
    p.lineTo(8.823859f, 8.70083f)
    p.lineTo(8.548739f, 8.75553f)
    p.lineTo(6.5104995f, 9.87493f)
    p.lineTo(6.7833195f, 11.2465105f)
    p.lineTo(6.78337f, 11.24682f)
    p.moveTo(10.26373f, 9.97834f)
    p.curveTo(10.25373f, 9.93474f, 10.24613f, 9.88984f, 10.23733f, 9.8458f)
    p.curveTo(9.67638f, 7.0257206f, 11.50662f, 4.2865705f, 14.32671f, 3.7256103f)
    p.curveTo(17.14679f, 3.1646702f, 19.88795f, 4.99451f, 20.4489f, 7.8146005f)
    p.curveTo(21.00984f, 10.634681f, 19.17799f, 13.37624f, 16.35791f, 13.9371805f)
    p.curveTo(13.58189f, 14.48937f, 10.88243f, 12.723611f, 10.26369f, 9.97834f)
    p.lineTo(10.26373f, 9.97834f)
    p.moveTo(13.57496f, 9.1819105f)
    p.curveTo(13.76901f, 10.1575f, 14.71808f, 10.79164f, 15.69367f, 10.59759f)
    p.curveTo(16.66925f, 10.40353f, 17.3034f, 9.45446f, 17.10934f, 8.47888f)
    p.curveTo(16.91529f, 7.50329f, 15.96662f, 6.87115f, 14.99103f, 7.06521f)
    p.curveTo(14.01544f, 7.25926f, 13.3809f, 8.20633f, 13.57496f, 9.18191f)
    p.lineTo(13.57496f, 9.1819105f)
  }

  def Synth(p: Path2D): Unit = {
    p.moveTo(11.915129f, 1.5152824f)
    p.lineTo(11.485068f, 5.426024f)
    p.lineTo(11.577655f, 5.891494f)
    p.lineTo(8.360579f, 8.0431185f)
    p.lineTo(7.9654574f, 7.7791157f)
    p.lineTo(4.1865396f, 6.680004f)
    p.lineTo(2.871926f, 8.647463f)
    p.lineTo(5.3328266f, 11.71472f)
    p.lineTo(5.731345f, 11.978057f)
    p.lineTo(5.7320867f, 11.981757f)
    p.lineTo(4.9753647f, 15.777331f)
    p.lineTo(4.509895f, 15.869922f)
    p.lineTo(1.0614183f, 17.763823f)
    p.lineTo(1.522332f, 20.080992f)
    p.lineTo(5.4330735f, 20.511053f)
    p.lineTo(5.8985434f, 20.418463f)
    p.lineTo(8.050167f, 23.635532f)
    p.curveTo(8.050751f, 23.636532f, 8.050167f, 23.638233f, 8.05085f, 23.638933f)
    p.lineTo(7.78344f, 24.034727f)
    p.lineTo(6.6836534f, 27.810253f)
    p.lineTo(8.651112f, 29.124866f)
    p.lineTo(11.721765f, 26.663292f)
    p.lineTo(11.985778f, 26.268173f)
    p.lineTo(15.781362f, 27.024895f)
    p.lineTo(15.874621f, 27.493763f)
    p.lineTo(17.767847f, 30.938835f)
    p.lineTo(20.088404f, 30.477247f)
    p.lineTo(20.519142f, 26.56991f)
    p.lineTo(20.425882f, 26.10104f)
    p.lineTo(23.64296f, 23.949413f)
    p.curveTo(23.643827f, 23.94924f, 23.64566f, 23.948866f, 23.64666f, 23.948671f)
    p.lineTo(24.042467f, 24.21608f)
    p.lineTo(27.817314f, 25.312475f)
    p.lineTo(29.131926f, 23.345005f)
    p.lineTo(26.671701f, 20.281149f)
    p.lineTo(26.275902f, 20.013739f)
    p.lineTo(27.028553f, 16.215443f)
    p.lineTo(27.500824f, 16.121502f)
    p.lineTo(30.9425f, 14.228954f)
    p.lineTo(30.481586f, 11.911793f)
    p.lineTo(26.577646f, 11.480378f)
    p.lineTo(26.105375f, 11.574318f)
    p.lineTo(23.95647f, 8.3531685f)
    p.lineTo(24.219807f, 7.95465f)
    p.lineTo(25.32027f, 4.1825247f)
    p.lineTo(23.352812f, 2.867911f)
    p.lineTo(20.284878f, 5.325406f)
    p.lineTo(20.021542f, 5.7239246f)
    p.curveTo(20.020775f, 5.724077f, 20.01884f, 5.724471f, 20.017841f, 5.724666f)
    p.lineTo(16.222267f, 4.9680057f)
    p.lineTo(16.12968f, 4.502545f)
    p.lineTo(14.235778f, 1.054059f)
    p.lineTo(11.915211f, 1.5156484f)
    p.lineTo(11.915129f, 1.5152824f)
    p.moveTo(14.061237f, 7.403675f)
    p.curveTo(14.134977f, 7.38709f, 14.210927f, 7.3739f, 14.285486f, 7.359069f)
    p.curveTo(19.056744f, 6.4100065f, 23.691078f, 9.506569f, 24.64014f, 14.277828f)
    p.curveTo(25.589203f, 19.049084f, 22.493317f, 23.686823f, 17.72206f, 24.635885f)
    p.curveTo(12.950801f, 25.584948f, 8.312385f, 22.485657f, 7.363323f, 17.714401f)
    p.curveTo(6.4290895f, 13.017692f, 9.416562f, 8.450504f, 14.061238f, 7.403675f)
    p.lineTo(14.061237f, 7.403675f)
    p.moveTo(15.408709f, 13.005885f)
    p.curveTo(13.758121f, 13.334208f, 12.685222f, 14.939914f, 13.013544f, 16.590502f)
    p.curveTo(13.341864f, 18.24108f, 14.947572f, 19.313988f, 16.59816f, 18.985664f)
    p.curveTo(18.248737f, 18.657345f, 19.31824f, 17.052305f, 18.989918f, 15.401727f)
    p.curveTo(18.661596f, 13.751139f, 17.059286f, 12.677565f, 15.408708f, 13.005884f)
    p.lineTo(15.408709f, 13.005885f)
  }

  def UGen(p: Path2D): Unit = {
    p.moveTo(7.890993f, 0.8148283f)
    p.lineTo(6.3311405f, 3.1562285f)
    p.lineTo(9.395916f, 6.9780283f)
    p.lineTo(9.887378f, 7.310728f)
    p.lineTo(8.950236f, 12.039228f)
    p.lineTo(8.370129f, 12.154529f)
    p.lineTo(4.0690722f, 14.514229f)
    p.lineTo(4.6429644f, 17.40803f)
    p.lineTo(9.517902f, 17.94223f)
    p.lineTo(10.100959f, 17.82323f)
    p.lineTo(10.103959f, 17.82323f)
    p.lineTo(12.778017f, 21.834332f)
    p.lineTo(12.451394f, 22.325731f)
    p.lineTo(11.083851f, 27.032831f)
    p.lineTo(13.532005f, 28.669031f)
    p.lineTo(17.356869f, 25.60123f)
    p.lineTo(17.68349f, 25.10973f)
    p.lineTo(22.414974f, 26.04993f)
    p.curveTo(22.416775f, 26.04993f, 22.416775f, 26.04993f, 22.417974f, 26.04993f)
    p.lineTo(22.530918f, 26.63293f)
    p.lineTo(24.887508f, 30.930931f)
    p.lineTo(25.040138f, 30.899931f)
    p.lineTo(27.930918f, 21.952831f)
    p.curveTo(24.463802f, 23.832232f, 20.100239f, 23.776932f, 16.593678f, 21.433931f)
    p.curveTo(11.631788f, 18.118431f, 10.23644f, 11.461031f, 13.406793f, 6.445732f)
    p.curveTo(13.457112f, 6.365732f, 13.512883f, 6.2864323f, 13.565529f, 6.207732f)
    p.curveTo(14.2902775f, 5.1229324f, 15.174552f, 4.211732f, 16.166315f, 3.4786322f)
    p.lineTo(7.890797f, 0.8077283f)
    p.lineTo(7.890993f, 0.8148283f)
  }

  def SynthDef(p: Path2D): Unit = {
    val p0 = new Path2D.Float()
    p0.moveTo(14.963682f, 9.7987f)
    p0.lineTo(15.041992f, 10.192301f)
    p0.lineTo(12.321272f, 12.012001f)
    p0.lineTo(11.987108f, 11.788701f)
    p0.lineTo(8.791235f, 10.859201f)
    p0.lineTo(7.6794553f, 12.523102f)
    p0.lineTo(9.760664f, 15.117102f)
    p0.lineTo(10.097699f, 15.342702f)
    p0.lineTo(9.457734f, 18.5526f)
    p0.lineTo(9.064079f, 18.6306f)
    p0.lineTo(6.1476603f, 20.2323f)
    p0.lineTo(6.537456f, 22.192f)
    p0.lineTo(9.844819f, 22.5557f)
    p0.lineTo(10.238474f, 22.477701f)
    p0.lineTo(12.058123f, 25.1984f)
    p0.curveTo(12.058123f, 25.1984f, 11.831977f, 25.5361f, 11.831977f, 25.5361f)
    p0.lineTo(10.901875f, 28.729101f)
    p0.lineTo(12.565779f, 29.8409f)
    p0.lineTo(15.162668f, 27.7591f)
    p0.lineTo(15.385943f, 27.425f)
    p0.lineTo(18.595907f, 28.0649f)
    p0.lineTo(18.674788f, 28.4615f)
    p0.lineTo(20.275904f, 31.375f)
    p0.lineTo(22.238438f, 30.9846f)
    p0.lineTo(22.602716f, 27.6802f)
    p0.lineTo(22.523836f, 27.2836f)
    p0.lineTo(25.244556f, 25.464f)
    p0.curveTo(25.245857f, 25.464f, 25.582273f, 25.690102f, 25.582273f, 25.690102f)
    p0.lineTo(28.774715f, 26.617401f)
    p0.lineTo(29.886497f, 24.953402f)
    p0.lineTo(27.805862f, 22.3623f)
    p0.lineTo(27.471123f, 22.1362f)
    p0.lineTo(28.107658f, 18.9239f)
    p0.lineTo(28.507057f, 18.8439f)
    p0.lineTo(31.41772f, 17.2434f)
    p0.lineTo(31.027925f, 15.283701f)
    p0.lineTo(27.726316f, 14.9189005f)
    p0.lineTo(27.326904f, 14.997901f)
    p0.lineTo(25.509552f, 12.273801f)
    p0.lineTo(25.732265f, 11.936701f)
    p0.lineTo(26.662941f, 8.746601f)
    p0.lineTo(24.999023f, 7.634801f)
    p0.lineTo(22.40444f, 9.713201f)
    p0.curveTo(22.40444f, 9.713201f, 22.179747f, 10.0502f, 22.17875f, 10.0502f)
    p0.lineTo(18.968767f, 9.4101f)
    p0.lineTo(18.890476f, 9.0165f)
    p0.lineTo(17.288774f, 6.1001f)
    p0.lineTo(15.32682f, 6.4904f)
    p0.lineTo(14.963682f, 9.7987f)
    p0.moveTo(17.142385f, 11.4712f)
    p0.curveTo(17.204735f, 11.4572f, 17.268986f, 11.4462f, 17.332022f, 11.4332f)
    p0.curveTo(21.367142f, 10.6306f, 25.286459f, 13.2494f, 26.089085f, 17.2845f)
    p0.curveTo(26.891726f, 21.3196f, 24.273493f, 25.2418f, 20.238375f, 26.0444f)
    p0.curveTo(16.20327f, 26.847f, 12.280512f, 24.225899f, 11.477884f, 20.1908f)
    p0.curveTo(10.687783f, 16.2188f, 13.214326f, 12.356199f, 17.142384f, 11.4709f)
    p0.lineTo(17.142385f, 11.4712f)
    p0.moveTo(18.281954f, 16.209099f)
    p0.curveTo(16.886034f, 16.486698f, 15.978673f, 17.844698f, 16.256336f, 19.240599f)
    p0.curveTo(16.534002f, 20.6365f, 17.891972f, 21.5439f, 19.287882f, 21.2662f)
    p0.curveTo(20.683804f, 20.9886f, 21.588293f, 19.631199f, 21.310627f, 18.235298f)
    p0.curveTo(21.032963f, 16.839298f, 19.677862f, 15.931398f, 18.281954f, 16.209099f)
    p0.lineTo(18.281954f, 16.209099f)
    val s = new BasicStroke(0.53f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10f)
    val p1 = s.createStrokedShape(p0)
    p.append(p1, false)

    p.moveTo(2.2599263f, 0.2611f)
    p.lineTo(2.2599263f, 4.9486f)
    p.lineTo(3.0099263f, 4.9486f)
    p.lineTo(3.0099263f, 0.26109982f)
    p.lineTo(2.2599263f, 0.26109982f)
    p.lineTo(2.2599263f, 0.2611f)
    p.moveTo(2.2599263f, 8.9418f)
    p.lineTo(2.2599263f, 13.6293f)
    p.lineTo(3.0099263f, 13.6293f)
    p.lineTo(3.0099263f, 8.9418f)
    p.lineTo(2.2599263f, 8.9418f)
    p.lineTo(2.2599263f, 8.9418f)
    p.moveTo(2.2599263f, 17.6224f)
    p.lineTo(2.2599263f, 22.3099f)
    p.lineTo(3.0099263f, 22.3099f)
    p.lineTo(3.0099263f, 17.6224f)
    p.lineTo(2.2599263f, 17.6224f)
    p.lineTo(2.2599263f, 17.6224f)
    p.moveTo(2.2599263f, 26.300201f)
    p.lineTo(2.2599263f, 30.987701f)
    p.lineTo(3.0099263f, 30.987701f)
    p.lineTo(3.0099263f, 26.300201f)
    p.lineTo(2.2599263f, 26.300201f)
    p.lineTo(2.2599263f, 26.300201f)

    p.moveTo(30.97655f, 2.271f)
    p.lineTo(26.289045f, 2.271f)
    p.lineTo(26.289045f, 3.021f)
    p.lineTo(30.97655f, 3.021f)
    p.lineTo(30.97655f, 2.271f)
    p.lineTo(30.97655f, 2.271f)
    p.moveTo(22.298822f, 2.271f)
    p.lineTo(17.611319f, 2.271f)
    p.lineTo(17.611319f, 3.021f)
    p.lineTo(22.298822f, 3.021f)
    p.lineTo(22.298822f, 2.271f)
    p.lineTo(22.298822f, 2.271f)
    p.moveTo(13.618158f, 2.271f)
    p.lineTo(8.930658f, 2.271f)
    p.lineTo(8.930658f, 3.021f)
    p.lineTo(13.618158f, 3.021f)
    p.lineTo(13.618158f, 2.271f)
    p.lineTo(13.618158f, 2.271f)
    p.moveTo(4.9374866f, 2.271f)
    p.lineTo(0.25f, 2.271f)
    p.lineTo(0.25f, 3.021f)
    p.lineTo(4.9374866f, 3.021f)
    p.lineTo(4.9374866f, 2.271f)
    p.lineTo(4.9374866f, 2.271f)
  }

  // ---- app ----

  def Minimize(p: Path2D): Unit = {
    p.moveTo( 2.0, 24.0)
    p.lineTo(29.0, 24.0)
    p.lineTo(29.0, 29.0)
    p.lineTo( 2.0, 29.0)
    p.closePath()
  }

  def Maximize(p: Path2D): Unit = {
    p.moveTo( 2.0,  2.0)
    p.lineTo(29.0,  2.0)
    p.lineTo(29.0, 29.0)
    p.lineTo( 2.0, 29.0)
    p.closePath()
    p.moveTo( 5.0,  5.0)
    p.lineTo(26.0,  5.0)
    p.lineTo(26.0, 26.0)
    p.lineTo( 5.0, 26.0)
    p.closePath()
  }

  def Pinned(p: Path2D): Unit = {
    p.moveTo(23.03125f, 0.53125f)
    p.curveTo(22.679699f, 1.5533035f, 23.71875f, 3.65625f, 23.71875f, 3.65625f)
    p.lineTo(15.5f, 9.875f)
    p.curveTo(15.5f, 9.875f, 12.251338f, 8.110042f, 10.25f, 9.03125f)
    p.curveTo(11.689804f, 10.725467f, 15.375f, 14.3125f, 15.375f, 14.3125f)
    p.lineTo(17.625f, 16.625f)
    p.curveTo(17.625f, 16.625f, 21.240767f, 20.320328f, 22.96875f, 21.75f)
    p.curveTo(23.866287f, 19.781847f, 22.125f, 16.5625f, 22.125f, 16.5625f)
    p.lineTo(28.28125f, 8.28125f)
    p.curveTo(28.28125f, 8.28125f, 30.425142f, 9.338682f, 31.46875f, 8.96875f)
    p.curveTo(28.731115f, 6.065033f, 25.93469f, 3.2688718f, 23.03125f, 0.53125f)
    p.lineTo(23.03125f, 0.53125f)
    p.moveTo(14.15625f, 15.75f)
    p.curveTo(12.502968f, 17.66335f, 7.54957f, 23.421309f, 4.71875f, 27.28125f)
    p.curveTo(4.738359f, 27.273304f, 4.75897f, 27.288403f, 4.78125f, 27.28125f)
    p.curveTo(8.53409f, 24.389627f, 14.270967f, 19.491327f, 16.1875f, 17.84375f)
    p.lineTo(14.15625f, 15.75f)
    p.lineTo(14.15625f, 15.75f)
  }

  def NotPinned(p: Path2D): Unit = {
    p.moveTo(16.84375f, 7.0f)
    p.curveTo(16.663853f, 9.216087f, 16.75f, 14.375f, 16.75f, 14.375f)
    p.lineTo(16.71875f, 17.5625f)
    p.curveTo(16.71875f, 17.5625f, 16.632814f, 22.767199f, 16.84375f, 25.0f)
    p.curveTo(18.8701f, 24.24296f, 19.9375f, 20.71875f, 19.9375f, 20.71875f)
    p.lineTo(30.125f, 19.21875f)
    p.curveTo(30.125f, 19.21875f, 30.906727f, 21.49239f, 31.90625f, 21.96875f)
    p.curveTo(32.02369f, 17.979712f, 32.023502f, 14.020084f, 31.90625f, 10.03125f)
    p.curveTo(30.934965f, 10.505367f, 30.1875f, 12.71875f, 30.1875f, 12.71875f)
    p.lineTo(19.96875f, 11.34375f)
    p.curveTo(19.96875f, 11.34375f, 18.910301f, 7.763767f, 16.84375f, 7.0f)
    p.lineTo(16.84375f, 7.0f)
    p.moveTo(14.90625f, 14.53125f)
    p.curveTo(12.415221f, 14.712822f, 4.808247f, 15.270046f, 0.0625f, 16.0f)
    p.curveTo(-0.05961561f, 15.98964f, 0.0243804f, 16.02684f, 0.09375f, 16.0625f)
    p.curveTo(4.827063f, 16.676004f, 12.460336f, 17.253107f, 14.90625f, 17.4375f)
    p.lineTo(14.90625f, 14.53125f)
    p.lineTo(14.90625f, 14.53125f)
  }

  def Document(p: Path2D): Unit = {
    p.moveTo(23.024f, 5.673f)
    p.curveTo(21.28f, 3.9789999f, 19.399f, 2.6219997f, 17.855999f, 2.4369998f)
    p.curveTo(17.772f, 2.4249997f, 17.685f, 2.4179997f, 17.592999f, 2.416f)
    p.lineTo(7.438f, 2.416f)
    p.curveTo(7.276f, 2.416f, 7.116f, 2.4789999f, 7.0020003f, 2.596f)
    p.curveTo(6.889f, 2.71f, 6.822f, 2.87f, 6.822f, 3.033f)
    p.lineTo(6.822f, 28.783f)
    p.curveTo(6.822f, 28.945002f, 6.885f, 29.1f, 7.002f, 29.218f)
    p.curveTo(7.119f, 29.334f, 7.273f, 29.397001f, 7.4379997f, 29.397001f)
    p.lineTo(25.802f, 29.397001f)
    p.curveTo(25.964f, 29.397001f, 26.119f, 29.335001f, 26.236f, 29.218f)
    p.curveTo(26.353f, 29.101f, 26.418f, 28.946001f, 26.418f, 28.783f)
    p.lineTo(26.418f, 11.648f)
    p.curveTo(26.382f, 9.659f, 24.824f, 7.49f, 23.024f, 5.673f)
    p.lineTo(23.024f, 5.673f)
    p.moveTo(22.157f, 6.545f)
    p.curveTo(22.962f, 7.3310003f, 23.685999f, 8.221f, 24.226f, 9.079f)
    p.curveTo(23.758f, 8.894f, 23.267f, 8.757001f, 22.806f, 8.648001f)
    p.curveTo(21.791f, 8.420001f, 20.798f, 8.328001f, 20.181f, 8.291f)
    p.curveTo(20.184f, 8.158f, 20.185f, 8.008f, 20.185f, 7.8450003f)
    p.curveTo(20.185f, 6.9760003f, 20.13f, 5.7370005f, 19.828999f, 4.6450005f)
    p.curveTo(19.825998f, 4.635f, 19.824f, 4.6250005f, 19.819998f, 4.6150002f)
    p.curveTo(20.584f, 5.119f, 21.416f, 5.788f, 22.157f, 6.545f)
    p.lineTo(22.157f, 6.545f)
    p.moveTo(25.184f, 28.164f)
    p.lineTo(8.052f, 28.164f)
    p.lineTo(8.052f, 3.646f)
    p.lineTo(17.594f, 3.646f)
    p.lineTo(17.594f, 3.648f)
    p.curveTo(18.01f, 3.623f, 18.369f, 4.034f, 18.644f, 4.974f)
    p.curveTo(18.894f, 5.869f, 18.956999f, 7.0360003f, 18.956f, 7.8450003f)
    p.curveTo(18.958f, 8.438001f, 18.928999f, 8.836f, 18.928999f, 8.836f)
    p.lineTo(18.88f, 9.488001f)
    p.lineTo(19.536f, 9.495001f)
    p.curveTo(19.539f, 9.495001f, 21.052f, 9.5130005f, 22.536f, 9.85f)
    p.curveTo(23.962f, 10.158f, 25.077f, 10.772f, 25.181f, 11.467f)
    p.curveTo(25.185f, 11.529f, 25.185999f, 11.591f, 25.185f, 11.649f)
    p.lineTo(25.185f, 28.164f)
    p.lineTo(25.184f, 28.164f)
  }

  def Normalized(p: Path2D): Unit = {
    p.moveTo(4.083f, 14.0f)
    p.lineTo(14.0f, 14.0f)
    p.lineTo(14.0f, 4.083f)
    p.lineTo(4.083f, 4.083f)
    p.lineTo(4.083f, 14.0f)
    p.lineTo(4.083f, 14.0f)
    p.moveTo(17.0f, 4.083f)
    p.lineTo(17.0f, 14.0f)
    p.lineTo(26.917f, 14.0f)
    p.lineTo(26.917f, 4.083f)
    p.lineTo(17.0f, 4.083f)
    p.lineTo(17.0f, 4.083f)
    p.moveTo(17.0f, 26.917f)
    p.lineTo(26.917f, 26.917f)
    p.lineTo(26.917f, 16.999f)
    p.lineTo(17.0f, 16.999f)
    p.lineTo(17.0f, 26.917f)
    p.lineTo(17.0f, 26.917f)
    p.moveTo(4.083f, 26.917f)
    p.lineTo(14.0f, 26.917f)
    p.lineTo(14.0f, 16.999f)
    p.lineTo(4.083f, 16.999f)
    p.lineTo(4.083f, 26.917f)
    p.lineTo(4.083f, 26.917f)
  }

  def Layered(p: Path2D): Unit = {
    p.moveTo(5.896f, 5.333f)
    p.lineTo(5.896f, 21.25f)
    p.lineTo(29.313f, 21.25f)
    p.lineTo(29.313f, 5.333f)
    p.lineTo(5.896f, 5.333f)
    p.lineTo(5.896f, 5.333f)
    p.moveTo(26.312f, 18.25f)
    p.lineTo(8.896f, 18.25f)
    p.lineTo(8.896f, 8.334f)
    p.lineTo(26.313f, 8.334f)
    p.lineTo(26.313f, 18.25f)
    p.lineTo(26.312f, 18.25f)
    p.lineTo(26.312f, 18.25f)
    p.moveTo(4.896f, 9.542f)
    p.lineTo(1.687f, 9.542f)
    p.lineTo(1.687f, 25.459f)
    p.lineTo(25.104f, 25.459f)
    p.lineTo(25.104f, 22.25f)
    p.lineTo(4.896f, 22.25f)
    p.lineTo(4.896f, 9.542f)
    p.lineTo(4.896f, 9.542f)
  }
}