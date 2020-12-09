package com.epam.jwd.example.decorator.api;

import com.epam.jwd.example.FigureType;
import com.epam.jwd.example.Point;
import com.epam.jwd.example.decorator.impl.Figure;

public interface FigureFactory {
    Figure createFigure(FigureType type, Point[] points);
}
