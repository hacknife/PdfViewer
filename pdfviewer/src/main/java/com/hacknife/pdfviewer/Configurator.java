package com.hacknife.pdfviewer;

import android.graphics.Color;

import com.hacknife.pdfviewer.cache.CellCache;
import com.hacknife.pdfviewer.cache.PageCache;
import com.hacknife.pdfviewer.cache.ThumbnailCache;
import com.hacknife.pdfviewer.core.PDFCore;
import com.hacknife.pdfviewer.listener.OnDoubleTapListener;
import com.hacknife.pdfviewer.listener.OnDrawListener;
import com.hacknife.pdfviewer.listener.OnErrorListener;
import com.hacknife.pdfviewer.listener.OnLongPressListener;
import com.hacknife.pdfviewer.listener.OnPageChangeListener;
import com.hacknife.pdfviewer.listener.OnPageErrorListener;
import com.hacknife.pdfviewer.listener.OnPageScrollListener;
import com.hacknife.pdfviewer.listener.OnScaleListener;
import com.hacknife.pdfviewer.listener.OnTapListener;
import com.hacknife.pdfviewer.model.Size;
import com.hacknife.pdfviewer.state.Direction;

public class Configurator {
    protected PdfView view;

    protected Configurator(PdfView view) {
        this.view = view;
        cellCache = new CellCache(view, this);
    }

    public static final int SCALE_MIN = 1;
    public static final int SCALE_MAX = 3;
    protected OnDoubleTapListener doubleTapListener;
    protected OnDrawListener drawListener;
    protected OnErrorListener errorListener;
    protected OnLongPressListener longPressListener;
    protected OnPageChangeListener pageChangeListener;
    protected OnPageErrorListener pageErrorListener;
    protected OnPageScrollListener pageScrollListener;
    protected OnTapListener tapListener;
    protected OnScaleListener scaleListener;
    protected int scaleMin = SCALE_MIN;
    protected int scaleMax = SCALE_MAX;
    protected boolean scaleEnable = true;
    protected boolean transverseEnable = true;
    protected Direction rollingDirection = Direction.VERTICAL;
    protected PDFCore core;
    protected float centerX = 0.5f;
    protected float centerY = 0.5f;
    protected float scale = 1f;
    protected Size packSize = new Size(0, 0);
    protected int pageNumber;
    protected int space = 2;
//    protected int spaceColor = Color.parseColor("#FF000000");
    protected int spaceColor = Color.parseColor("#F70FFFE8");
    protected ThumbnailCache thumbnailCache;
    protected PageCache pageCache;
    protected CellCache cellCache;
    protected int thumbnailCount = 10;
    protected PDFCore.MODE mode = PDFCore.MODE.WIDTH;


    public Configurator mode(PDFCore.MODE mode) {
        this.mode = mode;
        return this;
    }

    public PDFCore.MODE mode() {
        return mode;
    }

    public Configurator thumbnailCount(int thumbnailCount) {
        this.thumbnailCount = thumbnailCount;
        return this;
    }

    public int thumbnailCount() {
        return thumbnailCount;
    }

    public PageCache pageCache() {
        return pageCache;
    }

    public Configurator pageCache(PageCache pageCache) {
        this.pageCache = pageCache;
        return this;
    }

    public ThumbnailCache thumbnailCache() {
        return thumbnailCache;
    }

    public Configurator thumbnailCache(ThumbnailCache thumbnailCache) {
        this.thumbnailCache = thumbnailCache;
        return this;
    }

    public Configurator transverseEnable(boolean transverseEnable) {
        this.transverseEnable = transverseEnable;
        return this;
    }

    public boolean transverseEnable() {
        return transverseEnable;
    }

    public Configurator spaceColor(int spaceColor) {
        this.spaceColor = spaceColor;
        return this;
    }

    public int spaceColor() {
        return spaceColor;
    }

    public Configurator space(int space) {
        this.space = space;
        return this;
    }

    public int space() {
        return space;
    }

    public Configurator pageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    public int pageNumber() {
        return pageNumber;
    }

    public Size packSize() {
        return packSize;
    }

    public float scale() {
        return scale;
    }

    public Configurator scale(float scale) {
        this.scale = scale;
        return this;
    }

    public Configurator centerX(float centerX) {
        this.centerX = centerX;
        return this;
    }

    public Configurator centerY(float centerY) {
        this.centerY = centerY;
        return this;
    }

    public Configurator core(PDFCore core) {
        this.core = core;
        return this;
    }

    public PDFCore core() {
        return core;
    }

    public Configurator rollingDirection(Direction rollingDirection) {
        this.rollingDirection = rollingDirection;
        return this;
    }

    public Direction rollingDirection() {
        return rollingDirection;
    }

    public Configurator setScaleEnable(boolean scaleEnable) {
        this.scaleEnable = scaleEnable;
        return this;
    }

    public boolean scaleEnable() {
        return scaleEnable;
    }

    public Configurator setScaleMax(int scaleMax) {
        this.scaleMax = scaleMax;
        return this;
    }

    public Configurator setScaleMin(int scaleMin) {
        this.scaleMin = scaleMin;
        return this;
    }

    public Configurator onDoubleTapListener(OnDoubleTapListener doubleTapListener) {
        this.doubleTapListener = doubleTapListener;
        return this;
    }

    public Configurator onDrawListener(OnDrawListener drawListener) {
        this.drawListener = drawListener;
        return this;
    }

    public Configurator onError(OnErrorListener errorListener) {
        this.errorListener = errorListener;
        return this;
    }

    public Configurator onLongPress(OnLongPressListener longPressListener) {
        this.longPressListener = longPressListener;
        return this;
    }

    public Configurator onPageChange(OnPageChangeListener pageChangeListener) {
        this.pageChangeListener = pageChangeListener;
        return this;
    }

    public Configurator onPageError(OnPageErrorListener pageErrorListener) {
        this.pageErrorListener = pageErrorListener;
        return this;
    }

    public Configurator onPageScroll(OnPageScrollListener pageScrollListener) {
        this.pageScrollListener = pageScrollListener;
        return this;
    }

    public Configurator onTap(OnTapListener tapListener) {
        this.tapListener = tapListener;
        return this;
    }

    public Configurator onScale(OnScaleListener scaleListener) {
        this.scaleListener = scaleListener;
        return this;
    }

    public void build() {
        view.tryToad(this);
        view.configurator = this;
    }
}