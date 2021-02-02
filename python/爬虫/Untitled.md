```python
def root(fun, x0, args=(), method='hybr', jac=None, tol=None, callback=None,
         options=None):
    """
    Find a root of a vector function. 查找向量函数的根

    Parameters
    ----------
    fun : callable
        A vector function to find a root of. 查找根的向量函数
    x0 : ndarray
        Initial guess. 初步猜测。 
    args : tuple, optional
        Extra arguments passed to the objective function and its Jacobian. 额外的参数传递给目标函数及其Jacobian函数。
    method : str, optional
        Type of solver.  Should be one of

            - 'hybr'             :ref:`(see here) <optimize.root-hybr>`
            - 'lm'               :ref:`(see here) <optimize.root-lm>`
            - 'broyden1'         :ref:`(see here) <optimize.root-broyden1>`
            - 'broyden2'         :ref:`(see here) <optimize.root-broyden2>`
            - 'anderson'         :ref:`(see here) <optimize.root-anderson>`
            - 'linearmixing'     :ref:`(see here) <optimize.root-linearmixing>`
            - 'diagbroyden'      :ref:`(see here) <optimize.root-diagbroyden>`
            - 'excitingmixing'   :ref:`(see here) <optimize.root-excitingmixing>`
            - 'krylov'           :ref:`(see here) <optimize.root-krylov>`
            - 'df-sane'          :ref:`(see here) <optimize.root-dfsane>`

    jac : bool or callable, optional
        If `jac` is a Boolean and is True, `fun` is assumed to return the
        value of Jacobian along with the objective function. If False, the
        Jacobian will be estimated numerically.
        `jac` can also be a callable returning the Jacobian of `fun`. In
        this case, it must accept the same arguments as `fun`.
        bool 或 callable, 可选参数
		如果jac是布尔值且为True，则假定fun与目标函数一起返回Jacobian的值。如果为False，则		将根据数值估算雅可比行列式。杰克(jac)也可以成为回味乐趣的雅可比式的可呼唤。在这种情况		下，它必须接受与fun相同的参数。
    tol : float, optional
        Tolerance for termination. For detailed control, use solver-specific
        options.
        终止公差。要进行详细控制，请使用solver-specific选项。
    callback : function, optional
        Optional callback function. It is called on every iteration as
        ``callback(x, f)`` where `x` is the current solution and `f`
        the corresponding residual. For all methods but 'hybr' and 'lm'.
        可选的回调函数。在每次迭代中都被称为callback(x, f)其中x是当前解，f是相应的残差。对于除‘hybr’和‘lm’之外的所有方法。
    options : dict, optional
        A dictionary of solver options. E.g. `xtol` or `maxiter`, see
        :obj:`show_options()` for details.
		求解器选项字典。例如。 xtol或maxiter，请参见show_options()有关详细信息。
    Returns
    -------
    sol : OptimizeResult
        The solution represented as a ``OptimizeResult`` object.
        Important attributes are: ``x`` the solution array, ``success`` a
        Boolean flag indicating if the algorithm exited successfully and
        ``message`` which describes the cause of the termination. See
        `OptimizeResult` for a description of other attributes.
		解决方案表示为OptimizeResult Object 。重要属性是：x解决方案数组，success布尔标志，指示算法是否成功退出，以及message描述终止的原因。看到OptimizeResult用于其他属性的描述。
    See also
    --------
    show_options : Additional options accepted by the solvers

    Notes
    -----
    This section describes the available solvers that can be selected by the
    'method' parameter. The default method is *hybr*.
	本节介绍可以通过‘method’参数选择的可用求解器。默认方法是hybr。
    Method *hybr* uses a modification of the Powell hybrid method as
    implemented in MINPACK [1]_.
	方法hybr使用MINPACK中实现的Powell混合方法的修改[1]
    Method *lm* solves the system of nonlinear equations in a least squares
    sense using a modification of the Levenberg-Marquardt algorithm as
    implemented in MINPACK [1]_.
	方法lm使用对MINPACK中实现的Levenberg-Marquardt算法的修改，以最小二乘法求解非线性方程组[1]。
    Method *df-sane* is a derivative-free spectral method. [3]_
	方法df-sane是derivative-free频谱方法。
    Methods *broyden1*, *broyden2*, *anderson*, *linearmixing*,
    *diagbroyden*, *excitingmixing*, *krylov* are inexact Newton methods,
    with backtracking or full line searches [2]_. Each method corresponds
    to a particular Jacobian approximations. See `nonlin` for details.
	方法broyden1，broyden2，anderson，线性混合，diagbroyden，令人兴奋的混合，krylov是不精确的牛顿方法，具有回溯或整行搜索[2]。每种方法都对应于特定的雅可比近似值。参考nonlin有关详细信息。
    - Method *broyden1* uses Broyden's first Jacobian approximation, it is
      known as Broyden's good method.
      方法brooyden1使用Broyden的第一个Jacobian近似，这是Broyden的好方法。
    - Method *broyden2* uses Broyden's second Jacobian approximation, it
      is known as Broyden's bad method.
      broyden2方法使用Broyden的第二个Jacobian逼近法，即Broyden的错误方法。
    - Method *anderson* uses (extended) Anderson mixing.
    方法Anderson使用(扩展的)Anderson混合。
    - Method *Krylov* uses Krylov approximation for inverse Jacobian. It
      is suitable for large-scale problem.
      方法Krylov对逆Jacobian使用Krylov逼近。适用于large-scale问题。
    - Method *diagbroyden* uses diagonal Broyden Jacobian approximation.
    方法diagbroyden使用对角Broyden Jacobian逼近。
    - Method *linearmixing* uses a scalar Jacobian approximation.
    - Method *excitingmixing* uses a tuned diagonal Jacobian
      approximation.

    .. warning::

        The algorithms implemented for methods *diagbroyden*,
        *linearmixing* and *excitingmixing* may be useful for specific
        problems, but whether they will work may depend strongly on the
        problem.

    .. versionadded:: 0.11.0

    References
    ----------
    .. [1] More, Jorge J., Burton S. Garbow, and Kenneth E. Hillstrom.
       1980. User Guide for MINPACK-1.
    .. [2] C. T. Kelley. 1995. Iterative Methods for Linear and Nonlinear
       Equations. Society for Industrial and Applied Mathematics.
       <http://www.siam.org/books/kelley/fr16/index.php>
    .. [3] W. La Cruz, J.M. Martinez, M. Raydan. Math. Comp. 75, 1429 (2006).

    Examples
    --------
    The following functions define a system of nonlinear equations and its
    jacobian.

    >>> def fun(x):
    ...     return [x[0]  + 0.5 * (x[0] - x[1])**3 - 1.0,
    ...             0.5 * (x[1] - x[0])**3 + x[1]]

    >>> def jac(x):
    ...     return np.array([[1 + 1.5 * (x[0] - x[1])**2,
    ...                       -1.5 * (x[0] - x[1])**2],
    ...                      [-1.5 * (x[1] - x[0])**2,
    ...                       1 + 1.5 * (x[1] - x[0])**2]])

    A solution can be obtained as follows.

    >>> from scipy import optimize
    >>> sol = optimize.root(fun, [0, 0], jac=jac, method='hybr')
    >>> sol.x
    array([ 0.8411639,  0.1588361])

    """
    if not isinstance(args, tuple):
        args = (args,)

    meth = method.lower()
    if options is None:
        options = {}

    if callback is not None and meth in ('hybr', 'lm'):
        warn('Method %s does not accept callback.' % method,
             RuntimeWarning)

    # fun also returns the jacobian
    if not callable(jac) and meth in ('hybr', 'lm'):
        if bool(jac):
            fun = MemoizeJac(fun)
            jac = fun.derivative
        else:
            jac = None

    # set default tolerances
    if tol is not None:
        options = dict(options)
        if meth in ('hybr', 'lm'):
            options.setdefault('xtol', tol)
        elif meth in ('df-sane',):
            options.setdefault('ftol', tol)
        elif meth in ('broyden1', 'broyden2', 'anderson', 'linearmixing',
                      'diagbroyden', 'excitingmixing', 'krylov'):
            options.setdefault('xtol', tol)
            options.setdefault('xatol', np.inf)
            options.setdefault('ftol', np.inf)
            options.setdefault('fatol', np.inf)

    if meth == 'hybr':
        sol = _root_hybr(fun, x0, args=args, jac=jac, **options)
    elif meth == 'lm':
        sol = _root_leastsq(fun, x0, args=args, jac=jac, **options)
    elif meth == 'df-sane':
        _warn_jac_unused(jac, method)
        sol = _root_df_sane(fun, x0, args=args, callback=callback,
                            **options)
    elif meth in ('broyden1', 'broyden2', 'anderson', 'linearmixing',
                  'diagbroyden', 'excitingmixing', 'krylov'):
        _warn_jac_unused(jac, method)
        sol = _root_nonlin_solve(fun, x0, args=args, jac=jac,
                                 _method=meth, _callback=callback,
                                 **options)
    else:
        raise ValueError('Unknown solver %s' % method)

    return sol
```

