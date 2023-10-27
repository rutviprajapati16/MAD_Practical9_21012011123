**Study:**
ImageView, Frame by Frame Animation, Twin Animation, Immersive Mode, Display Edge to Edge, SplashScreen, AnimationDrawable, onWindowFocusChanged() Method, AnimationUtils class, loadAnimation() method, setAnimationListener() method, overridePendingTransition() method, finish() method, anim folder in res, convert SVG file to .xml file

**AIM:**
What is Frame by Frame Animation? What is Twin Animation? How can you achieve edge-to-edge content display in your app?  Create Android Application to demonstrate Frame by frame animation and splash screen to demonstrate twin animation according to below instructions.

**Ans:**
Frame-by-frame animation changes the contents of the Stage in every frame. It is best suited to complex animation in which an image changes in every frame instead of simply moving across the Stage.
Animation has always been about the illusion of movement. Tweening is a major part of making that illusion look real. Tweening in animation is a short for inbetweening.
You can make your app display edge-to-edge—using the entire width and height of the display—by drawing behind the system bars. The system bars are the status bar and the navigation bar.

1.Create MainActivity according to below UI design.

2.Create SplashActivity according to Video

3.Create gradient Rectangle by using <gradient> tag in <shape> tag for background of SplashActivity. Use radial rectangle with x = 0.9, y =0.9, radius = 1500. Start Color pink and End Color blue. shape should be rectangle

4.Add these all in project: <animation-list>, oneShot attribute, <set> tag, android:startOffset = 100, android:duration=1000, <scale> tag, <translate> tag, <rotate> tag, <alpha> tag
