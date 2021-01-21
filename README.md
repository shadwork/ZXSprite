# ZXSprite Android Studio Build Wrapper

![ZX Sprite Editor screenshot](/media/zx_sprite_editor_screenshot.png)

Main goal of this fork is :
 * create release ready-to-run version 
 * develop and build under Android Studio instead of NetBeans

You can get jar file with Gradle task
**libzxsprite->Tasks->Build->jar** and run it from Android studio with task
**libzxsprite->Tasks->other->runJar**

# ZXSprite

Sprite editor for creating ZX Spectrum sprites and fonts. 
Exports to various formats will be available for direct use in Z80 assembler files. 
The first output format will produce Zeus dg pseudo operations.

e.g.
```
dg 0 0 0 0 0 0 0 0 
dg 0 0 0 1 0 0 0 0
dg 0 0 1 1 1 0 0 0
dg 0 1 0 1 0 1 0 0
dg 0 0 0 1 0 0 0 0
dg 0 0 0 1 0 0 0 0
dg 0 0 0 1 0 0 0 0
dg 0 0 0 1 0 0 0 0
```

Work in progress, there's many things to be done yet. 
